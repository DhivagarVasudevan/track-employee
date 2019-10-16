package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.EmployeeDao;
import com.bank.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empd;
	
	public void save(Employee emp) {
		empd.save(emp);
		}

	public void update(Employee emp) {
		empd.save(emp);
	}
	
	public void delete(Employee emp) {
		empd.delete(emp);
	}
	
	
}
