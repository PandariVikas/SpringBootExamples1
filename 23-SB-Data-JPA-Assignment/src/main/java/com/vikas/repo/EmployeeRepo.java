package com.vikas.repo;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikas.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	List<Employee> deleteByDesignation(String designation);

//	Page<Employee> findAll(Pageable pageable);
}
