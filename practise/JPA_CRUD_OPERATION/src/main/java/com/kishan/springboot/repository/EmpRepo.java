package com.kishan.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kishan.springboot.Entity.Employee_Table;

@Repository
public interface EmpRepo extends JpaRepository<Employee_Table, Long> {

}
