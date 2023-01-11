package com.functional.interfacess;

@FunctionalInterface
interface Calculator {

	//public void switchOn();
	
	//public void sum(int a);
	
	int Subtraction(int a,int b);
}

public class Test {

	public static void main(String[] args) {
		/*Calculator cal= ()->System.out.println("Switch on");
		cal.switchOn();*/
		
	
		 /*Calculator cal=( a)->System.out.println("Sum:"+a);
		 cal.sum(52);*/
		
	       /*Calculator cal= (a,b)->  a-b;
	       System.out.println("Subtraction :"+cal.Subtraction(10, 8));*/
		
		Calculator cal= ( a, b)->{
			if(a<b) {
			 throw new RuntimeException("Invalid Input");
			}
			else {
				return a-b;
			}
		};
		
		System.out.println("Subtraction :" + cal.Subtraction(100, 20));
		
	}
	
}
