package com.kishan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kishan.demo.entity.Employee;

@Repository
public interface EmpReposotiry extends JpaRepository<Employee, Long> {

}
