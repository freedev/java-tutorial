package com.damore.effective.sample3;

public enum EnumSingleton {
    INSTANCE;

    public void handleEvent() {
        System.out.println("Event handled");
    };

    public static void main(String[] args) {
        INSTANCE.handleEvent();
    }
}
