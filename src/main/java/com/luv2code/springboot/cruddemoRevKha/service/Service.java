package com.luv2code.springboot.cruddemoRevKha.service;

import java.util.List;

import com.luv2code.springboot.cruddemoRevKha.entity.Employee;



public interface Service {
	
	public List<Employee> getEmployees();
	
	
	public Employee getEmployee (int employeeid);
	
	public void saveorupdate (Employee employee);
	
	public void delete (int employeeid);
	
	public List<Employee> searchBy(String theName);
	

}
