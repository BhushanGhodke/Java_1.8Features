package com.stream.apii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

// Even number from list
public class Collectionsfilter {	
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(201);
		list.add(300);
		list.add(407);
		System.out.println(list);
		List<Integer> list1=  list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even List "+ list1);
	    List<Integer >list2= list.stream().filter(i->i%2!=0).collect(Collectors.toList()) ; 
		System.out.println("Odd List "+list2);
	}
}
