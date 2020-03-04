
package com.employee.controller;
 
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
 
@Named
@RequestScoped
public class EmployeeController {
 
	private Employee employee = new Employee();
 
	@EJB
	private EmployeeService service;
 
	public Employee getEmployee() {
		return employee;
	}
 
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
 
	public void saveEmployee(Employee emp) {
		service.addEmployee(emp);
	}
 
}