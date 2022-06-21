package com.reavture.dao;

import org.hibernate.Session;

public class EmployeeDao {

	public int insert(Employee e) {
		
		Session ses = hibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();	
		
		int pk = (int) ses.save(e);
	
	public List<Employee> findAll() {
		
	}
	
	public boolean delete() {
		return false;
	}
	
	public boolean update(Employee e) {
		return false;
	}
}
