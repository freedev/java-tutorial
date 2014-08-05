/**
 * 
 */
package com.damore.effective.sample11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author freedev
 *
 */
public class MyCloneable implements Cloneable {

	int n;
	
	int[] arrayInt;
	
	String[] arrayString;
	
	List<String> listString = new ArrayList<>();
	List<Integer> listInteger = new ArrayList<>();
	
	protected MyCloneable clone() {
		try {
			MyCloneable cloned = (MyCloneable)super.clone();
			return cloned;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
/*		if (this.arrayInt != null)
			cloned.arrayInt = this.arrayInt.clone();
*/
//		Collections.copy(cloned.listInteger, this.listInteger);
//		Collections.copy(cloned.listString, this.listString);

	}
	
	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		
		MyCloneable m1 = new MyCloneable();
		String[] prova = {"stringa di array"};
		String[] prova2 = {"stringa di array 2"};
		
		int n = prova.length;
		
		String s = "";
		s.length();
		m1.getListInteger().size();
		
		int[] prova3 = {10, 20, 30};
		int[] prova4 = {40, 50};
		
		m1.setListString(Arrays.asList("ciao", "ariciao", "ariariciao"));
		m1.setArrayString(prova);
		m1.setListInteger(Arrays.asList(10, 20, 30, 40));
		m1.setArrayInt(prova3);

		MyCloneable m2 = m1.clone();

		m2.setN(2);
		m2.setListInteger(Arrays.asList(30, 40));
		m2.setListString(Arrays.asList("solo ciao", "poi ariciao"));
		m2.setArrayString(prova2);
		m2.setArrayInt(prova4);
		
		System.out.println(m1);
		
		System.out.println(m2);
		
	}
	
	/**
	 * 
	 * @param list generic type
	 * @return all the elements concatenated within into a string
	 */
	
	public static <T> String join(T[] list) {
		if (list == null)
			return "null";
		StringBuffer sb = new StringBuffer();
		char delimiter = '[';
		for (T e : list) {
			sb.append(delimiter);
			sb.append(e); 
			delimiter = ',';
		}
		sb.append(']');
		return sb.toString();
	}

	public static String join(int[] list) {
		if (list == null)
			return "null";
		StringBuffer sb = new StringBuffer();
		char delimiter = '[';
		for (int e : list) {
			sb.append(delimiter);
			sb.append(e); 
			delimiter = ',';
		}
		sb.append(']');
		return sb.toString();
	}
	

	/**
	 * @return the String representation of the object
	 */
	public String toString() {
		return "n: " +n + " listString: " + listString + " listInteger: " + listInteger + " arrayInt:" + join(arrayInt) + " arrayString: " + join(arrayString);
	}

	/**
	 * @return the n
	 */
	public int getN() {
		return n;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(int n) {
		this.n = n;
	}

	/**
	 * @return the listString
	 */
	public List<String> getListString() {
		return listString;
	}

	/**
	 * @param listString the listString to set
	 */
	public void setListString(List<String> listString) {
		this.listString = listString;
	}

	/**
	 * @return the listInteger
	 */
	public List<Integer> getListInteger() {
		return listInteger;
	}

	/**
	 * @param listInteger the listInteger to set
	 */
	public void setListInteger(List<Integer> listInteger) {
		this.listInteger = listInteger;
	}

	/**
	 * @return the arrayString
	 */
	public String[] getArrayString() {
		return arrayString;
	}

	/**
	 * @param arrayString the arrayString to set
	 */
	public void setArrayString(String[] arrayString) {
		this.arrayString = arrayString;
	}

	/**
	 * @return the arrayInt
	 */
	public int[] getArrayInt() {
		return arrayInt;
	}

	/**
	 * @param arrayInt the arrayInt to set
	 */
	public void setArrayInt(int[] arrayInt) {
		this.arrayInt = arrayInt;
	}
	
}
