package com.damore.effective.sample5;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;

public class BabyBoomer {

   private static final Date START_DATE;
   private static final Date END_DATE;

   static {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("CET"));
        calendar.set(2000, 0, 01);
        START_DATE = calendar.getTime();
        calendar.set(2010, 0, 01);
        END_DATE = calendar.getTime();
   }

   public static boolean isWithinThePeriod(Date date) {
       return (END_DATE.compareTo(date) > 0) && 
              (START_DATE.compareTo(date) <= 0);
   }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("CET"));
        calendar.set(2009, 0, 01);
        System.out.println(isWithinThePeriod(calendar.getTime()));
    }
	
}
