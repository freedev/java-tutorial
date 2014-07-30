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
	
	public static void addToListWildcard(Employ e, java.util.List<? extends Employ> list) {
//		list.add(e);  // Error
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
	 */
	public static void main(String[] args) {
		CompanyBEmploy be = new CompanyBEmploy("Vinc", 10000);
		CompanyAEmploy pe = new CompanyAEmploy("Vinc", 10100);
		
		java.util.List<Employ> list = new java.util.ArrayList<>();
		
		Application.<Employ>addToListTypeParameter(be, list);
		Application.addToList(pe, list);
		list.add(pe);
		list.add(be);
		
		Application.processEmployTypeParameter(list);

		java.util.List<CompanyBEmploy> listCompanyB = new java.util.ArrayList<>();
		
		listCompanyB.add(be);
		listCompanyB.add(be);
		Application.addToListTypeParameter(new CompanyBEmploy("Prova", 10), listCompanyB);

		
		Application.processEmployWildcard(listCompanyB);
		
		System.out.println(list.size());
		System.out.println(Application.compare(be, pe));
	}

}
