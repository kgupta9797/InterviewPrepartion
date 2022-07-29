package com.kishan.springboot.service;

import com.kishan.springboot.Entity.Employee_Table;

public interface EmployeeServiceInterface {


//	void addEmployee(Employee_Table emp);

	void addEmployee(Employee_Table emp);

	Employee_Table selectAll();


}
