package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.projection.EmployeeProjection;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Create
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // Read All
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Read By Id
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    // Update
    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }

    @GetMapping("/name/{name}")
        public List<Employee> getByName(@PathVariable String name) {
        return employeeService.searchByName(name);
    }

    @GetMapping("/email/{email}")
        public Employee getByEmail(@PathVariable String email) {
        return employeeService.searchByEmail(email);
    }
    
    @GetMapping("/department/{department}")
        public List<Employee> getByDepartment(@PathVariable String department) {
        return employeeService.searchByDepartment(department);
    }
    @GetMapping("/query/{email}")
        public Employee getUsingQuery(@PathVariable String email) {
            return employeeService.searchEmailUsingQuery(email);
        }
    @GetMapping("/native/{name}")
        public List<Employee> getUsingNative(@PathVariable String name) {
        return employeeService.searchNameUsingNativeQuery(name);
    }

    @GetMapping("/page")
    public Page<Employee> getEmployees(Pageable pageable) {
        return employeeService.getEmployees(pageable);
    }

    @GetMapping("/sort/{field}")
    public List<Employee> sortEmployees(@PathVariable String field) {
        return employeeService.getEmployeesSorted(field);
    }
        @GetMapping("/projection")
    public List<EmployeeProjection> getProjection() {
    return employeeService.getEmployeeProjection();

    }

}