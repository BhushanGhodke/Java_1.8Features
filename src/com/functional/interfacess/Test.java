package com.functional.interfacess;

@FunctionalInterface
interface Calculator {

	public void switchOn();
}

public class Test {

	public static void main(String[] args) {
		Calculator cal= ()->System.out.println("Switch on");
		cal.switchOn();
	}
	
}
