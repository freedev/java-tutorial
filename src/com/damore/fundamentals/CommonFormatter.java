/**
 * 
 */
package com.damore.fundamentals;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;

/**
 * @author freedev
 *
 */
public class CommonFormatter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		Formatter f = new Formatter();
//		f.format("%5.2f %x %T", 10F, new Integer(10000), c);
		f.format("%1$td/%1$tm/%1$tY %1$tB", c);
		System.out.println(f);

		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.applyPattern("###,###.##");
		String output = decimalFormat.format(10000.123F);
		System.out.println(output);
		
	}

}
