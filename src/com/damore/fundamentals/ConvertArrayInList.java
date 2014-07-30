/**
 * 
 */
package com.damore.fundamentals;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Test main class
 * @author freedev
 */
public class ConvertArrayInList {
 
	public static List<Integer> asList(final int[] is)
    {
		/*
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i : array2) {
			list2.add(i);
		}
		*/
            return new AbstractList<Integer>() {
                    public Integer get(int i) { return is[i]; }
                    public int size() { return is.length; }
                    public Integer set(int i, Integer v) { is[i] = v; return v; }
            };
    }
	
	public static void main(String[] args) {
		String[] array = {"UNO", "DUE", "TRE", "QUATTRO"};
		List<String> list = Arrays.asList(array);

		int[] array2 = {5, 6, 7, 8, 9, 10, 1, 2, 3, 4};
		
		List<Integer> list2 = ConvertArrayInList.asList(array2);

//		Arrays.sort(array2);
		
		Comparator intComparator = new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		Collections.sort(list2, intComparator);

		System.out.println(list2);
		
		System.out.println(Arrays.binarySearch(list2.toArray(), new Integer(9), intComparator));
	}
}
