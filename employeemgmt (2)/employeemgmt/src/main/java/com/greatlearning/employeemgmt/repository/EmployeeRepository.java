package com.greatlearning.employeemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemgmt.entity.Employee;

public class EmployeeRepository  extends JpaRepository<Employee, Long> {

}
