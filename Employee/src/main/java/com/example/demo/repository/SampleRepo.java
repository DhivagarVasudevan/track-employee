package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Employee;

public interface SampleRepo extends CrudRepository<Employee,Integer>{

}
