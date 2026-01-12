package com.jad;

public class Grault {
    private Foo foo;

    // +Grault(foo : Foo)
    public Grault(Foo foo) {
        this.foo = foo;
    }

    public Foo getFoo() {
        return this.foo;
    }



}
