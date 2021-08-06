package com.employer.profile.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employer.profile.entity.Employee;
import com.employer.profile.exception.EmployeeProfileNotFound;
import com.employer.profile.repository.EmployeeProfileRepository;



@RestController
@RequestMapping("/api")
public class EmployeeController {
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeProfileRepository employeeRepository;

	//Get All profile
	@GetMapping("/employees")
	public java.util.List<Employee>  getAllEmployee(){
		logger.info("Retrieving all Employee Profile");
		return employeeRepository.findAll();
		
		}
	@PostMapping("/employees")
	public Employee createEmployeeProfile(@Valid @RequestBody Employee emaplyee ) {
		logger.info("Adding New Employee Profile");
		return employeeRepository.save(emaplyee);
	}
	
	@GetMapping("employees/{id}")
	public ResponseEntity<Employee> findByEmployeeId(@PathVariable(value = "id") long employeeId ) throws EmployeeProfileNotFound{
		logger.info("Retrieving  Employee Profile by Id");
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new EmployeeProfileNotFound("Employee Profile Not Found For Id : " + employeeId));
		
	return ResponseEntity.ok().body(employee)	;
	}
}
