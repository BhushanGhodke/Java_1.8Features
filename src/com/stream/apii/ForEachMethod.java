package com.stream.apii;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {


	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(5);
		list.add(20);

		System.out.println("Before Sorting :" + list);
		
		Consumer<Integer> c= (i)->{
		
			System.out.println("Square of all element in list is:"+i*i);
		};		
		list.stream().forEach(c);
	}
}
