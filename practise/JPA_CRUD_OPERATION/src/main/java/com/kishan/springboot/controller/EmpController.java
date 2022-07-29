package com.kishan.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kishan.springboot.Entity.Employee_Table;
import com.kishan.springboot.repository.EmpRepo;
import com.kishan.springboot.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/db")
public class EmpController {

	/*
	 * @Autowired EmpRepo emprepo;
	 * 
	 * @GetMapping public List<Employee_Table> getAllEmployees() {
	 * System.out.println("all emp details"); return emprepo.findAll();
	 * 
	 * }
	 */
	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	@PostMapping("/save")
	public void addEmployee(@RequestBody Employee_Table emp)
	{
		employeeServiceInterface.addEmployee(emp);
	}
	

	@GetMapping("/select")
	public Employee_Table selectEmployee()
	{
		return employeeServiceInterface.selectAll();
	}
	
	

}
