package com.lti.interfacepk;

public class Dealer extends Person implements Tax
{
	@Override
	public void hello() {
		System.out.println("Dealer Hello ....");
	}
	
	@Override
	public void payIncomeTax() {
		System.out.println("Dealer Pay Tax .... ");
	}
}
