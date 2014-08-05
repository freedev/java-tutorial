package com.damore.tutorial.generics.test2;

interface ListenerInterface<T> {
    void handleEvent(T event);
}