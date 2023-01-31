package org.example.streamAPI;

public class Employee {

	private int id;
	
	private String name;
	
	private int salary;
	
	private int grade;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Employee(int id, String name, int salary, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	
}
