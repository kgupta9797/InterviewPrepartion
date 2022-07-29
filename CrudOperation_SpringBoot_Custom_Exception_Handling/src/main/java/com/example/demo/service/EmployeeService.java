package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.PassThroughSourceExtractor;
import org.springframework.stereotype.Service;

import com.example.demo.custom.exception.BusinessException;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepos;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	EmployeeRepos emprepo;

	@Override
	public Employee addEmp(Employee emp) {
		// when ename is null
		if (emp.getName().isEmpty() || emp.getName().length() == 0) {
			throw new BusinessException("601", "Please Send proper name,It blank");
		}
		try {
			Employee savedEmployee = emprepo.save(emp);
			return savedEmployee;
		} catch (IllegalArgumentException e) { // when whole emp null
			throw new BusinessException("602", "given employee is null" + e.getMessage());
		} catch (Exception e) { // when whole emp null
			throw new BusinessException("603", "Something went wrong in service layer while saving" + e.getMessage());
		}
	}

	@Override
	public List<Employee> findAllEmp() {
		// if employee list is empty
		try {
			List<Employee> emplist = emprepo.findAll();
			if (emplist.isEmpty())
				throw new BusinessException("604", "Hey List is complete empty");
			return emplist;
		} catch (Exception e) {
			throw new BusinessException("605", "Hey List is  empty while fetch" + e.getMessage());
		}

	}

	@SuppressWarnings("deprecation")
	@Override
	public Employee finfById(long id) {
		try {
			return emprepo.findById(id).get();
		} catch (IllegalArgumentException e) {
			throw new BusinessException("606", "id is null please send some id " + e.getMessage());
		} catch (NoSuchElementException e) {
			throw new BusinessException("607", "id is not present in database" + e.getMessage());
		}

	}

	@Override
	public Employee deleteByID(long id) {
		try {
			emprepo.deleteById(id);
			return null;
		} catch (IllegalArgumentException e) {
			throw new BusinessException("608", "id is null please send some id " + e.getMessage());
		} catch (NoSuchElementException e) {
			throw new BusinessException("609", "id is not present in database" + e.getMessage());
		}
	}

	@Override
	public Employee deleteAll() {
		emprepo.deleteAll();
		return null;
	}

}
