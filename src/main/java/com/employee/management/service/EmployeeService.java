package com.employee.management.service;

import org.springframework.stereotype.Component;

import com.employee.management.entity.Employee;
import com.employee.management.model.EmployeeRequest;

import java.util.List;

@Component
public interface EmployeeService {

	public Employee saveEmployee(EmployeeRequest employeeRequest);


    Employee getEmployeeDetail(long id);

    List<Employee> getEmployeeList();
}
