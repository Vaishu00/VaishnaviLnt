package com.lti.interfacepk;

public class FullTimeFaculty extends Faculty
{
	@Override
	public void hello() {
		System.out.println("FullTime Hello .... ");
	}
	
	@Override
	public void payIncomeTax() {
		System.out.println("FullTime Pay Tax .... ");
	}
}
