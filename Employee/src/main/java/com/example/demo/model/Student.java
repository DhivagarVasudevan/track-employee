package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class Student {
	
	@javax.persistence.Id
	private int Id;
	private String name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + "]";
	}

}
