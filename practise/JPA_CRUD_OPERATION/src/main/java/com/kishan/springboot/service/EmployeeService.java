package com.kishan.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishan.springboot.Entity.Employee_Table;
import com.kishan.springboot.repository.EmpRepo;

@Service
public class EmployeeService implements EmployeeServiceInterface {
	@Autowired
	private EmpRepo emprepo;

	

	@Override
	public void addEmployee(Employee_Table emp) {
emprepo.save(emp);		
	}



	@Override
	public Employee_Table selectAll() {
		//List<Employee_Table> list = emprepo.findAll();
		//emprepo.findAll();
			return (Employee_Table) emprepo.findAll();

	}
	
	
	
	

}
