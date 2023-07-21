package com.stream.apii;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsMap {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(25);
		list.add(64);
		list.add(19);
		list.add(46);
		
		System.out.println(list);
		int sum=0;
		List<Integer> list1= list.stream().map(i->i+5).collect(Collectors.toList());
	    System.out.println(list1); 
	}
}
