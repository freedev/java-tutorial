package com.damore.tutorial;

import java.util.Locale;
import java.util.Locale.Builder;

public class FPAdder {
   /**
    * A basic explanation of this method
    * @params args
    */
   public static void main(String[] args) {
      Locale.setDefault(new Builder().setLanguage("it").setRegion("IT").build());
      double tot = 0;
      for (String s : args) {
         tot += Double.valueOf(s);
      }
      System.out.format("%5.2f%n", tot);
   }
}

