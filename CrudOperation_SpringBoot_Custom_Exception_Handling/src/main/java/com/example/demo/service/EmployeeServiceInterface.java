package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeServiceInterface {

	Employee addEmp(Employee emp);

	List<Employee> findAllEmp();

	Employee finfById(long id);

	Employee deleteByID(long id);

	Employee deleteAll();

}
