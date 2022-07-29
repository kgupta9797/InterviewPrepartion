package com.kishan.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kishan.demo.entity.Employee;


public interface ServiceInterface  {

	Employee addEmployee(Employee emp);

	List<Employee> findAll();

	void deletebyId(Long id);

	void deleteAll();

}
