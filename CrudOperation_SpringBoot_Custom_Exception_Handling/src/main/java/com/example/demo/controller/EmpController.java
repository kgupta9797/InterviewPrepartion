package com.example.demo.controller;

import java.util.List;

import javax.xml.ws.Response;

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

import com.example.demo.custom.exception.BusinessException;
import com.example.demo.custom.exception.ControllerException;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepos;
import com.example.demo.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/code")
public class EmpController {

	@Autowired
	EmployeeServiceInterface employeeServiceInterface;

//findall
	@GetMapping("/selectAll")
	public ResponseEntity<?> getallEmp() {
		try {
			List<Employee> listofall = employeeServiceInterface.findAllEmp();
			System.out.println("all empinfo getting");
			return new ResponseEntity<List<Employee>>(listofall, HttpStatus.OK);

		} catch (BusinessException e) {
			ControllerException cException = new ControllerException(e.getErrorCodeString(), e.getErrorMessageString());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			ControllerException cException = new ControllerException("611",
					"Something went wrong in controller while fetching all" + e.getMessage());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		}

	}

	// find by ID
	@GetMapping("/empid/{id}")
	public ResponseEntity<?> findById(@PathVariable long id) {
		try {
			Employee fetchbyId = employeeServiceInterface.finfById(id);
			return new ResponseEntity<Employee>(fetchbyId, HttpStatus.OK);
		} catch (BusinessException e) {
			ControllerException cException = new ControllerException(e.getErrorCodeString(), e.getErrorMessageString());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			ControllerException cException = new ControllerException("611",
					"Something went wrong in controller while fetching" + e.getMessage());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		}
	}

//add employyee
	@PostMapping("/save")
	public ResponseEntity<?> addEmployee(@RequestBody Employee emp) {
		try {
			Employee savedemp = employeeServiceInterface.addEmp(emp);
			return new ResponseEntity<Employee>(savedemp, HttpStatus.CREATED);
		} catch (BusinessException e) {
			ControllerException cException = new ControllerException(e.getErrorCodeString(), e.getErrorMessageString());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			ControllerException cException = new ControllerException("611",
					"Something went wrong in controller while saving" + e.getMessage());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		}
	}

//delete employeeby id

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmp(@PathVariable long id) {
		try {
			Employee deleteEmpById = employeeServiceInterface.deleteByID(id);
			System.out.println("delete the user: " + id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (BusinessException e) {
			ControllerException cException = new ControllerException(e.getErrorCodeString(), e.getErrorMessageString());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			ControllerException cException = new ControllerException("611",
					"Something went wrong in controller while deleteing" + e.getMessage());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		}

	}

	@DeleteMapping("/deleteAll")
	public ResponseEntity<?> deleteAll() {
		Employee deleteEmpById = null;
		try {
			deleteEmpById = employeeServiceInterface.deleteAll();
			System.out.println("all record is deleted");
			return new ResponseEntity<Employee>(deleteEmpById, HttpStatus.CREATED);

		} catch (BusinessException e) {
			ControllerException cException = new ControllerException(e.getErrorCodeString(), e.getErrorMessageString());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			ControllerException cException = new ControllerException("611",
					"Something went wrong in controller while deleting" + e.getMessage());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		}

	}
	// update employee

	@PutMapping("/update")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee emp) {
		try {
			Employee savedemp = employeeServiceInterface.addEmp(emp);

			return new ResponseEntity<Employee>(savedemp, HttpStatus.OK);
		} catch (BusinessException e) {
			ControllerException cException = new ControllerException(e.getErrorCodeString(), e.getErrorMessageString());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			ControllerException cException = new ControllerException("611",
					"Something went wrong in controller while updating" + e.getMessage());
			return new ResponseEntity<ControllerException>(cException, HttpStatus.BAD_REQUEST);

		}
	}

}
