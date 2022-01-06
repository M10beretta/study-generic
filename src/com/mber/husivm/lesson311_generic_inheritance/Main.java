package com.mber.husivm.lesson311_generic_inheritance;

public class Main {
    public static void main(String[] args) {


    }
}

class Parent {}
class GenParent<T> extends Parent{}

class Child__________ extends GenParent{}
class ChildString____ extends GenParent<String>{}
class ChildTString<T> extends GenParent<String>{}
class ChildT______<T> extends GenParent{}
class ChildTT_____<T> extends GenParent<T>{}
class ChildXT___<X,T> extends GenParent<T>{}

interface GenInterface<T> {
    T getT();
}

class One implements GenInterface {
    @Override
    public Object getT() {
        return null;
    }
}

class Two implements GenInterface<String> {
    @Override
    public String getT() {
        return null;
    }
}

class Three<T> implements GenInterface<T> {
    @Override
    public T getT() {
        return null;
    }
}

