package com.frappuccino.nice.ruletest.squid.noncompliant;

public class S1444Rule {

    public static Foo FOO = new Foo();

    static class Foo {

        String field1;
        Integer field2;
    }

}

