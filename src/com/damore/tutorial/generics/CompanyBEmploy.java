/**
 * 
 */
package com.damore.tutorial.generics;

/**
 * @author freedev
 *
 */
public class CompanyBEmploy extends Employ {

	public CompanyBEmploy() {}

	/**
	 * @param name
	 * @param salary
	 */
	public CompanyBEmploy(String name, int salary) {
		super(name, salary);
	}
	
	public void print() {
		System.out.println("Company B "+this.getName()+" "+this.getSalary());
	}

}
