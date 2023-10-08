package com.employee.management.controller;
import com.employee.management.entity.Employee;
import com.employee.management.entity.UserDetails;
import com.employee.management.model.EmployeeRequest;
import com.employee.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/create")
	public ResponseEntity<String> saveEmployeesRecords(
			@AuthenticationPrincipal UserDetails userdetail,
			@RequestBody EmployeeRequest employeeRequest) {
		
		//employee service implementation
		Employee employee = employeeService.saveEmployee(employeeRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body("Employee created with id");
//		if(userdetail.getRole().equals("ADMIN")) {
//
//		}
//		else
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Access denied");
//
	}

	@GetMapping("/{id}")
	public Employee getEmployeesRecords(@PathVariable(name = "id") long id) {

		//get employee detail implementation
        return employeeService.getEmployeeDetail(id);
    }

	@GetMapping("/")
	public List<Employee> getEmployeesList() {

		//get employee detail implementation
		return employeeService.getEmployeeList();
	}
	
}
