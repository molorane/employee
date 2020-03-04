package com.employee.service.impl;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
 
@Stateless
public class EmployeeServiceImpl implements EmployeeService {
 
	@PersistenceContext(name = "EmployeeApp")
	private EntityManager em;
 
	@Override
	public void addEmployee(Employee emp) {
 
		em.persist(emp);
 
	}
 
}