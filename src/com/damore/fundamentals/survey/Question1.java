/**
 * 
 */
package com.damore.fundamentals.survey;

/**
 * @author freedev
 *
 */
class Question1 {
    public static void main(String[] args) {
      for(int i=0; i<10; ++i) {
        try {
          if (i % 3 == 0) 
             throw new Exception("E0");
          try {
            if (i % 3 == 1) {
               throw new Exception("E1");
            }
            System.out.println(i);
          } catch (Exception inner) {
            i *= 2;
          } finally {
            ++i;
          }
        }catch (Exception outer) {
          i += 3;
        }finally{
          ++i;
        }
      }
    }
  }
