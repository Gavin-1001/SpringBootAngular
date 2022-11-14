package com.SpringBootAngular.repository;

import com.SpringBootAngular.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {



}
