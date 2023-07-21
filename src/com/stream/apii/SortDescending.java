package com.stream.apii;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescending {


	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(25);
		list.add(64);
		list.add(19);
		list.add(46);

		Comparator<Integer> c=(i1,i2)->i2.compareTo(i1);
		System.out.println("Before Sorting :" + list);
		
		List<Integer> list1 = list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("After Sorting Descending 1 :" + list1);
	
		List<Integer> list2= list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("After Sorting Descending 2 :"+list2);
		
		List<Integer> list3= list.stream().sorted(c).collect(Collectors.toList());
        System.out.println("After sorting Descending 3 :"+list3); 
	}
}
