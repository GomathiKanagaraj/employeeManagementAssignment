package com.employee.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.management.entity.Employee;
import com.employee.management.model.EmployeeRequest;
import com.employee.management.repository.EmployeeRepository;
import com.employee.management.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class employeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(EmployeeRequest employeeRequest) {
		
		Employee employee = new Employee();
		
		employee.setId(employeeRequest.getEmployeeId());
		employee.setFirstName(employeeRequest.getFirstName());
		employee.setLastName(employeeRequest.getLastName());
        return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeDetail(long id) {
            return employeeRepository.findById(id).get();

    }

	@Override
	public List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee ->employeeList.add(employee));
		return employeeList;
	}

}
