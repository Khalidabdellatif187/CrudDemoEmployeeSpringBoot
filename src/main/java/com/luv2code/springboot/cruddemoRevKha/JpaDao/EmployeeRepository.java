package com.luv2code.springboot.cruddemoRevKha.JpaDao;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.luv2code.springboot.cruddemoRevKha.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee , Integer>{

	public List<Employee> findByFirstnameContainsOrLastnameContainsAllIgnoreCase(String name, String lName);
	
	
}
