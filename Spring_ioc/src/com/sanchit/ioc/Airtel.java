package com.sanchit.ioc;

/**
 * @author Sanchit Raina
 */
public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using Airtel sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Airtel sim");
	}

}
