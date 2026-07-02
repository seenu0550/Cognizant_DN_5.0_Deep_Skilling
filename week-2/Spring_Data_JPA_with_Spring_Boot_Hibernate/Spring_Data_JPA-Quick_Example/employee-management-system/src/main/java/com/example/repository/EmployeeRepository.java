package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

import com.example.projection.EmployeeProjection;

import com.example.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {



    // Derived Query Methods
    List<Employee> findByName(String name);

    Employee findByEmail(String email);

    List<Employee> findByNameContaining(String name);

    List<Employee> findByDepartmentName(String departmentName);
    List<EmployeeProjection> findBy();

    // JPQL Query
    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee getEmployeeByEmail(@Param("email") String email);

    // Native SQL Query
    @Query(value = "SELECT * FROM employee WHERE name = :name", nativeQuery = true)
    List<Employee> getEmployeeByName(@Param("name") String name);

}