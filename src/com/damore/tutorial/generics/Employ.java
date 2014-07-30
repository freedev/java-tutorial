/**
 * 
 */
package com.damore.tutorial.generics;

/**
 * @author freedev
 *
 */
public abstract class Employ implements EmployInterface {

	private String name = "";
	private int salary = 0;

	public Employ() {}

	public Employ(String name, int salary) {
		this.name = name;
		this.salary = salary;
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
	
}
