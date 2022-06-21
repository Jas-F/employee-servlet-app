package com.reavture.service;

import com.reavture.dao.EmployeeDao;

public class EmployeeService {

	private EmployeeDao edao;
	
	public EmployeeService(Employee edao) {
		this.edao = edao;
	}
	
	public Employee confirmLogin(String username, String password) {
		
		Optional<Employee> possibleEmp edao.findAll().stream;
		.filter(e -> e.getUsername().equals(username) && e.getPassword().equals(password))
		.filterfirst();
		
		return (possibelEmp.isPresent() ? possibleEmp.get() : new Employee());
	}
	
	public List<Employee> getAll(){
		return edao.findAll();
	}
}
