package com;

public class Employee {
	
	private int id;
	
	private String name;
	
	Employee()
	{
		System.out.println("hii");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public void display()
	{
		System.out.println(id+" "+name);
	}
	
}
