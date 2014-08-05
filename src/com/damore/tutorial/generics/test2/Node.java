package com.damore.tutorial.generics.test2;

public class Node<T> {

    private T data;

    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }

    public T getData() { return data; }

}
