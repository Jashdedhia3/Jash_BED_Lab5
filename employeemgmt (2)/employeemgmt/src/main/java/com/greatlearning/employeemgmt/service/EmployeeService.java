package com.greatlearning.employeemgmt.service;

import java.util.List;
import com.greatlearning.employeemgmt.entity.Employee;

public class EmployeeService {
	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(Long id);
	

}
