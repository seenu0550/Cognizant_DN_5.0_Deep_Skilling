package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Create
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Read
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Read By Id
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    // Update
    public Department updateDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Delete
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }

}