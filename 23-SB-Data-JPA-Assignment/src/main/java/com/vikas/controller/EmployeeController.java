package com.vikas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vikas.entity.Employee;
import com.vikas.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/saveemployee")
	public List<Employee> saveEmployee(@RequestBody List<Employee> employeelist){
		return service.saveEmployee(employeelist);
	}
	
	@GetMapping("/getAll")
	public List<Employee> listOfEmps(){
		return service.getAll();
	}
	@GetMapping("/get/{empId}")
	public Optional<Employee> getEmployeeDetails(@PathVariable Integer empId) {
		return  service.getEmployee(empId);
	}

	@DeleteMapping("/delete/{designation}")
	public void deleteByDesignation(@PathVariable String designation) {
		 service.deleteEmployeeByDesignation(designation);
	}
	
//	@RequestMapping(value="/pagingAndSortingEmployee/{pageNumber}/{pageSize}", method = RequestMethod.GET)
//	public Page<Employee> employeePagination(@PathVariable Integer pageNumber, @PathVariable Integer pageSize){
//		return service.getEmployeePagination(pageNumber,pageSize);
//		
//	}
}

