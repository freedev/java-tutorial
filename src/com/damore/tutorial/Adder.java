package com.damore.tutorial;
public class Adder {
   /**
    * A basic explanation of this method
    * @params args
    */
   public static void main(String[] args) {
      int tot = 0;
      for (String s : args) {
         tot += Integer.valueOf(s);
      }
      System.out.println(tot);
   }
}

