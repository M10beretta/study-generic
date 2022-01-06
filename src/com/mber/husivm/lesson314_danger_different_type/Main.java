package com.mber.husivm.lesson314_danger_different_type;

public class Main {

    public static void main(String[] args) {
        Gen<House> gen = new Gen<>();
        add(gen);
        System.out.println(gen.getT());
    }

    static void add(Gen gen) {
        gen.setT("Hi");
    }
}

class House {
}

class Gen<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}