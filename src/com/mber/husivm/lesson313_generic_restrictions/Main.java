package com.mber.husivm.lesson313_generic_restrictions;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Gen<Job> gen = new Gen<>();
        gen.setT(new Job());
        gen.doJob();

        Gen<ChildJob> childJob = new Gen<>();
        childJob.setT(new ChildJob());
        childJob.doJob();
    }
}

class Job implements Serializable {
    void doIt() {
        System.out.println("doIt");
    }
}

class ChildJob extends Job {
}

class Gen<T extends Job & Serializable> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void doJob() {
        t.doIt();
    }
}