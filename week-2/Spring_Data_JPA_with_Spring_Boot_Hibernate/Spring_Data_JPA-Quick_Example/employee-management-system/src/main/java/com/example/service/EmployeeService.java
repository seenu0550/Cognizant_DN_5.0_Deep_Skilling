package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.example.projection.EmployeeProjection;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    // Create
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Read All
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Read By Id
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // Update
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Delete
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }


    public List<Employee> searchByName(String name) {
    return employeeRepository.findByName(name);
}

public Employee searchByEmail(String email) {
    return employeeRepository.findByEmail(email);
}

public List<Employee> searchByDepartment(String department) {
    return employeeRepository.findByDepartmentName(department);
}

public Employee searchEmailUsingQuery(String email) {
    return employeeRepository.getEmployeeByEmail(email);
}

public List<Employee> searchNameUsingNativeQuery(String name) {
    return employeeRepository.getEmployeeByName(name);
}



// Pagination
public Page<Employee> getEmployees(Pageable pageable) {
    return employeeRepository.findAll(pageable);
}

// Sorting
public List<Employee> getEmployeesSorted(String field) {
    return employeeRepository.findAll(Sort.by(field));
}

// Pagination + Sorting
public Page<Employee> getEmployees(Pageable pageable, String field) {
    Pageable sortedPage =
            org.springframework.data.domain.PageRequest.of(
                    pageable.getPageNumber(),
                    pageable.getPageSize(),
                    Sort.by(field));

    return employeeRepository.findAll(sortedPage);
}

public List<EmployeeProjection> getEmployeeProjection() {
    return employeeRepository.findBy();
}
}