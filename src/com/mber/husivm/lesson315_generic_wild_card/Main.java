package com.mber.husivm.lesson315_generic_wild_card;

public class Main {
    public static void main(String[] args) {
        Gen<? super Toyota> genSup = new Gen<>();
        Gen<? extends Toyota> genExt = new Gen<>();

        Object o = genSup.getT();
        Toyota t = genExt.getT();
    }
}

class Car {}
class Toyota extends Car {}
class Corolla extends Toyota {}

class Gen<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}