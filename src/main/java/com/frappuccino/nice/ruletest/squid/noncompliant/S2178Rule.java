package com.frappuccino.nice.ruletest.squid.noncompliant;

public class S2178Rule {

	public void doCheckBooleanBitwise1() {

		if (getTrue() | getFalse()) { // Noncompliant; both sides evaluated
			System.out.println(1);
		}
	}
	
	public void doCheckBooleanBitwise2() {

		if (getTrue() & getFalse()) { // Noncompliant; both sides evaluated
			System.out.println(1);
		}
	}

	public boolean getTrue() {
		return true;
	}

	public boolean getFalse() {
		return true;
	}
	
}
