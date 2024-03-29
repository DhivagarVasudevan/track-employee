package com.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
