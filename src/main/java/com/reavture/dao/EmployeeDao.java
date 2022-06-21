package com.reavture.dao;

import com.revature.models.Employee;
import com.revature.util.HibernateUtil;

public class EmployeeDao {

	public int insert(Employee e) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();	
		
		int pk = (int) ses.save(e);
	
	public List<Employee> findAll() {
		Session ses = HibernateUtil.getSession();
		
		List<Employee> emps = ses.CreateQueey("from Employee", Employee.class).list();
		
		return emps;
	}
	
	public boolean delete() {
		return false;
	}
	
	public boolean update(Employee e) {
		return false;
	}
}
