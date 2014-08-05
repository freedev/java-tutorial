/**
 * 
 */
package com.damore.tutorial.generics;


/**
 * @author freedev
 *
 */
public class Application {

	public static <T extends Employ> int compare(T o1, T o2) {
		if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else if (o1.getSalary() < o2.getSalary()) {
			return -1;
		} 
		return 0;
	}
	
	public static <T extends Employ> void addToListTypeParameter(T e, java.util.List<T> list) {
		list.add(e);
	}

	/*
	public static void addToListWildcard(java.util.List<? extends Employ> list) {
		list.add(e);  // Error
	}
	*/
	
	public static <T extends Employ> void addNewElement(java.util.List<T> list, java.lang.Class<T> klass) throws InstantiationException, IllegalAccessException {
		T e = klass.newInstance();
		list.add(e);
	}

	public static void addNewElement2(java.util.List<? super CompanyAEmploy> list, java.lang.Class<CompanyAEmploy> klass) throws InstantiationException, IllegalAccessException {
		CompanyAEmploy e = klass.newInstance();
		list.add(e);
	}
	
	public static void addToList(Employ e, java.util.List<Employ> list) {
		list.add(e);
//		list.add(new CompanyAEmploy("ciao", 10));
	}
	
	public static void processEmployWildcard(java.util.List<? extends Employ> list) {
		for(Employ e : list) {
			e.print();
		}
	}
	
	public static <T extends Employ> void processEmployTypeParameter(java.util.List<T> list) {
		for(T e : list) {
			e.print();
		}
		/// T t = new T();
	}
		
	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		CompanyBEmploy be = new CompanyBEmploy("Vinc", 10000);
		CompanyAEmploy pe = new CompanyAEmploy("Vinc", 10100);
		
		java.util.List<Employ> listEmploy = new java.util.ArrayList<>();
		java.util.List<CompanyBEmploy> listCompanyB = new java.util.ArrayList<>();
		java.util.List<CompanyAEmploy> listCompanyA = new java.util.ArrayList<>();
		
		Application.<Employ>addToListTypeParameter(be, listEmploy);
		Application.addToList(pe, listEmploy);

		listEmploy.add(pe);
		listEmploy.add(be);
		
		Application.processEmployTypeParameter(listEmploy);

		listCompanyB.add(be);
		listCompanyB.add(be);
		Application.addToListTypeParameter(new CompanyBEmploy("Prova", 10), listCompanyB);
		Application.addToListTypeParameter(new CompanyBEmploy("Prova", 10), listEmploy);
//		Application.addToListTypeParameter(new CompanyBEmploy("Prova", 10), listCompanyA);
		Application.addToListTypeParameter(new CompanyAEmploy("Prova", 10), listEmploy);
		Application.addToListTypeParameter(new CompanyAEmploy("Prova", 10), listCompanyA);
//		Application.addToListWildcard(new CompanyBEmploy("Prova", 10), listCompanyA);
		Application.addNewElement(listCompanyA, CompanyAEmploy.class);
		
		Application.processEmployWildcard(listCompanyB);
		
		System.out.println(listEmploy.size());
		System.out.println(Application.compare(be, pe));
		
	}

}
