package com.kishan.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kishan.demo.entity.Employee;
import com.kishan.demo.repository.EmpReposotiry;

@Service
public class ServiceImpl implements ServiceInterface {
	@Autowired
	EmpReposotiry emprepo;

	@Override
	public Employee addEmployee(Employee emp) {
		
	  emprepo.save(emp);
	  return  emprepo.save(emp);

	}

	@Override
	public List<Employee> findAll() {
	
		return emprepo.findAll();
	}

	@Override
	public void deletebyId(Long id) {
		// TODO Auto-generated method stub
	 emprepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		System.out.println("truncate tBLE");
		emprepo.deleteAll();		
	}

}
