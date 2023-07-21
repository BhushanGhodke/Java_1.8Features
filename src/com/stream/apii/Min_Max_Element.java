package com.stream.apii;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Min_Max_Element {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(5);
		list.add(20);

		System.out.println("Before Sorting :" + list);
		 Integer min = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum:" + min);

		 Integer max = list.stream().min((i1,i2)->i2.compareTo(i1)).get();
			System.out.println("Maximum:" + max);
	}
	
}
