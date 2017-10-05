package com.dnb.web.demo.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dnb.web.demo.model.Employee;

@RestController
public class EmployeeController {

	
	@RequestMapping(value="/api/employee", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployee(){
		Employee emp = new Employee();
		emp.setAge(31);
		emp.setId(318087);
		emp.setName("Krishna");
		return new ResponseEntity<Employee>  (emp,HttpStatus.OK);
		
	}
}
