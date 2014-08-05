/**
 * 
 */
package com.damore.tutorial;

/**
 * @author freedev
 *
 */
class BaseClass<U> {
	public void invokeStatefulThread() {}
    void getState() {
    	System.out.println("inside get state");
    }
}

public class Test {
    public static void main(String[] args) {
        final BaseClass<String> instance = new BaseClass<String>() {
            public void invokeStatefulThread() {
                // Create our runnable
                final Runnable threadCode = new Runnable() {
                    public void run() {
                        /* 1 */ getState();
//                        /* 2 */ this.getState();
//                        /* 3 */ super.getState();
//                        /* 4 */ BaseClass.this.getState();
//                        /* 5 */ BaseClass<String>.this.getState();
                    }
                };
                new Thread( threadCode ).start();
            }
            
        };

        instance.invokeStatefulThread();
    }
}