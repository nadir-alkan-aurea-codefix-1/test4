package com.frappuccino.nice.ruletest.squid.compliant;

public final class S00122Rule {

    public void doSomething() {
        boolean someCondition = true;
        if (someCondition) {
            doSomething();
        }
    }
}

