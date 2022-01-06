package com.mber.husivm.lesson312_generic_methods;

public class Main {
    public static void main(String[] args) {
        Gen<String> gen = new Gen<>(new Main());
        System.out.println(gen.<Integer>getE(5));
    }

    <T> void met(T t) {
    }
}

class Gen<T> {
    T t;

    <X> Gen(X t) {
    }

    public void setT(T t) {
        this.t = t;
    }

    <E> E getE(E e) {
        return e;
    }
}
