package com.vikas.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.vikas.entity.Employee;
import com.vikas.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	public List<Employee> saveEmployee(List<Employee> employeelist){
		return repo.saveAll(employeelist);
	}
	public List<Employee> getAll(){
		return repo.findAll();
	}
	public Optional<Employee> getEmployee(Integer empId) {
		return repo.findById(empId);
	}
	public void deleteEmployee(Integer empId) {
		repo.deleteById(empId);
	}
	public void deleteEmployeeByDesignation(String designation) {
		 repo.deleteByDesignation(designation);
		
	}
//	public Page<Employee> getEmployeePagination(Integer pageNumber, Integer pageSize) {
//		Pageable pageable =(Pageable) PageRequest.of(pageNumber,pageSize);
//		return repo.findAll(pageable);
//	}
}
