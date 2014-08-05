package com.damore.tutorial.generics.test2;

public class MyNode extends Node<Integer> {
    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }

    public Integer getData() { return super.getData(); }    

    public static void main(String[] args) {
    	MyNode mn = new MyNode(5);
    	Node n = mn;            // A raw type - compiler throws an unchecked warning
    	n.setData("Hello");     // Causes a ClassCastException to be thrown.
    	Integer x = mn.getData();
    }
     
}
