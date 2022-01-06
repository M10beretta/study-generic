package com.mber.husivm.lesson310_what_is_a_generic;


public class Main {
    public static void main(String[] args) {

        Gen<String> stringGen = new Gen<>();
        stringGen.setT("Hi");
        String stringGenT = stringGen.getT();
        System.out.println(stringGenT);

        GenObj stringGenObj = new GenObj();
        stringGenObj.setT("Hi");
        Object stringGenObjT = stringGenObj.getT();
        System.out.println(stringGenObjT);
    }
}

class Gen<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class GenObj{
    private Object t;

    public Object getT() {
        return t;
    }

    public void setT(Object t) {
        this.t = t;
    }
}
