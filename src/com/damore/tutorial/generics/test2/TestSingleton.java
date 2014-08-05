package com.damore.tutorial.generics.test2;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListenerInterface<String> lis = Singleton.INSTANCE.<String>getListener();
		ListenerInterface<Integer> lii = Singleton.INSTANCE.<Integer>getListener();
		
		lis.handleEvent("CIAO");

	}

}
