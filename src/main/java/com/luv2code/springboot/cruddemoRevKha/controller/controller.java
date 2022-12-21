package com.luv2code.springboot.cruddemoRevKha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.cruddemoRevKha.entity.Employee;
import com.luv2code.springboot.cruddemoRevKha.service.Service;




@Controller
@RequestMapping("/api")
public class controller {
	
	
	
	private Service service;

	@Autowired
	public controller(Service service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping("/show")
	public String get(Model themodel) {
		
		List<Employee> employees= service.getEmployees();
		
		themodel.addAttribute("Employees", employees);
		
		return "list";
	}
	
	
	@GetMapping("/add")
	public String add (Model themodel) {
		Employee employee = new Employee();
		
		themodel.addAttribute("employee", employee);
		
		return "add-form";
	}
	
	
	@PostMapping("/save")
	public String Save (@ModelAttribute ("employee") Employee emp) {
		
		service.saveorupdate(emp);
		
		return "redirect:/api/show";
	}
	
	
	@GetMapping("/update")
	public String update(@RequestParam ("employeeId") int id , Model themodel) {
		
		Employee emp = service.getEmployee(id);
		
		themodel.addAttribute("employee", emp);
		
		return "add-form";
	}
	
	
	
	
	@GetMapping("/delete")
	public String delete (@RequestParam ("employeeId") int id) {
		
		service.delete(id);
		
		return "redirect:/api/show";
	}
	
	@GetMapping("/search")
	public String delete(@RequestParam("name") String theName,
						 Model theModel) {
		
		// delete the employee
		List<Employee> theEmployees = service.searchBy(theName);
		
		// add to the spring model
		theModel.addAttribute("Employees", theEmployees);
		
		// send to /employees/list
		return "list";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
