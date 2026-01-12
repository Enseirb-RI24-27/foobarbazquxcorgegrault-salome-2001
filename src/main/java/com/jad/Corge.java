package com.jad;

public class Corge {
    private Foo foo;    // <->foo : Foo

    // +Corge(foo : Foo)
    public Corge(Foo foo) {
        this.foo = foo;
    }

    public Foo getFoo() {
        return this.foo;
    }
    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}

