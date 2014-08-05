package com.damore.effective.sample11;

import java.util.Calendar;

public class SampleConcatenation {

	public static final int SIZE = 100;
	
	public static void main(String[] args) {
		
		long[] list = new long[SIZE];
		for (int i = 0; i < SIZE; i++) {
			list[i] = (long)Math.floor(Math.random() * 100) + 1;
		}
		
		long start = Calendar.getInstance().getTimeInMillis();
		
		StringBuilder sb = new StringBuilder();
		char c = '[';
		for (long l : list) {
			sb.append(c);
			sb.append(l);
			c = ',';
		}
		sb.append(']');
		
		long end = Calendar.getInstance().getTimeInMillis();
		
		System.out.println("StringBuilder " + (end - start) + " " + sb);
		
		long start1 = Calendar.getInstance().getTimeInMillis();
		
		String s = "";
		for (long l : list) {
			s += l;
		}
		
		long end1 = Calendar.getInstance().getTimeInMillis();
		
		System.out.println("String " + (end1 - start1));
		

	}
}
