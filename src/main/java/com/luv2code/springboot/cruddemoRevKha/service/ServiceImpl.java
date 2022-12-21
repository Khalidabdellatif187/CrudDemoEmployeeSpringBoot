package com.luv2code.springboot.cruddemoRevKha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.luv2code.springboot.cruddemoRevKha.JpaDao.EmployeeRepository;
import com.luv2code.springboot.cruddemoRevKha.entity.Employee;


@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	
	private EmployeeRepository repository;
	
	
	
	
	
	
    @Autowired
	public ServiceImpl(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Employee> getEmployees() {
		return repository.findAll();
	}

	@Override
	public Employee getEmployee(int employeeid) {
	   
    Optional<Employee> result = repository.findById(employeeid);
		
		Employee theEmployee = null;
		
		if (result.isPresent()) {
			theEmployee = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + employeeid);
		}
		
		return theEmployee;
	}

	@Override
	public void saveorupdate(Employee employee) {
		repository.save(employee);
            
	}

	@Override
	public void delete(int employeeid) {
		repository.deleteById(employeeid);

	}

	@Override
	public List<Employee> searchBy(String theName) {
		
		List<Employee> results = null;
		
		if (theName != null && (theName.trim().length() > 0)) {
			results = repository.findByFirstnameContainsOrLastnameContainsAllIgnoreCase(theName, theName);
		}
		else {
			
			results = getEmployees();
		}
		
		return results;
	}

	

	

	

}
