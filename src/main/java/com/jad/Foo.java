package com.jad;

import java.util.ArrayList;

public class Foo {
    private Bar bar;                    // <-bar : Bar
    private ArrayList<Baz> bazs;        // <-bazs : Baz[]
    private Qux qux;                    // <-qux : Qux
    private Corge corge;                // <->corge : Corge
    private ArrayList<Grault> graults;  // <-graults : Graults[]

    // +Foo(bar : Bar)
    public Foo(Bar bar) {
        this.bar = bar;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }
    public Bar getBar() {
        return this.bar;
    }
    public ArrayList<Baz> getBazs() {
        return this.bazs;
    }
    public Qux getQux() {
        return this.qux;
    }
    public Corge getCorge() {
        return this.corge;
    }
    public ArrayList<Grault> getGraults() {
        return this.graults;
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }
//    public void addGrault() {
//        this.graults.add();
//    }

}
