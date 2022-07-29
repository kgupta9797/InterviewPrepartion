package com.kishan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kishan.demo.entity.Employee;
import com.kishan.demo.repository.EmpReposotiry;
import com.kishan.demo.service.ServiceInterface;

@RestController
@RequestMapping("/db")
public class Controller {

	@Autowired
	ServiceInterface serviceInterface;

	@GetMapping("/select")
	public List<Employee> getallEmp() {
		return serviceInterface.findAll();
	}

	@PostMapping("/insert")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
		Employee employee = serviceInterface.addEmployee(emp);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteEmployeebyId(@PathVariable Long id) {

		serviceInterface.deletebyId(id);
		return new ResponseEntity<Void>(HttpStatus.OK);

	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {

		serviceInterface.addEmployee(emp);

		Employee updated= serviceInterface.addEmployee(emp);;
		return new ResponseEntity<Employee>(updated ,HttpStatus.OK);

	}

	@DeleteMapping("/deleteall")
	public  ResponseEntity<Void> deleteAllEmp() {
		serviceInterface.deleteAll();
		return new ResponseEntity<Void>(HttpStatus.OK);

	}

}
