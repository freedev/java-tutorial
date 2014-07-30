/**
 * 
 */
package com.damore.tutorial.generics;

/**
 * @author freedev
 *
 */
public class CompanyAEmploy extends Employ {

	public CompanyAEmploy() {}

	/**
	 * @param name
	 * @param salary
	 */
	public CompanyAEmploy(String name, int salary) {
		super(name, salary);
	}

	public void print() {
		System.out.println("Company A "+this.getName()+" "+this.getSalary());
	}

}
