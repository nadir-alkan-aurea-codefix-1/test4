package com.frappuccino.nice.ruletest.squid.noncompliant;

public class S1206Rule {

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj); 
		// Noncompliant - should also override "hashCode()"
	}
}
