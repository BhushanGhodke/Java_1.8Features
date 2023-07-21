package com.stream.apii;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringAscending {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Bhushan");
		list.add("Chetan");
		list.add("Mahesh");
		list.add("Anushka");
		list.add("Maheshwari");

		Comparator<String> c = (s1, s2) -> s2.compareTo(s1);

		System.out.println("Before Sorting :" + list);

		// Sort string in ascending order
		List<String> list1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sorting Ascending order : " + list1);

		// Sort the string in descending order
		List<String> list2 = list.stream().sorted(c).collect(Collectors.toList());
		System.out.println("After Sorting Descending order: " + list2);

		// Sort the String according to length in ascending order
		Comparator<String> compare = (s1, s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			if (l1 < l2)
				return -1;
			else if (l1 > l2)
				return +1;
			else
				return s1.compareTo(s2);

		};
		List<String> list3 = list.stream().sorted(compare).collect(Collectors.toList());

		System.out.println("Ascending sorting based on length: " + list3);

		// Sort the String according to length in descending order
		Comparator<String> compare1 = (s1, s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			if (l1 < l2)
				return +1;
			else if (l1 > l2)
				return -1;
			else
				return s2.compareTo(s1);
		};

		List<String> list4 = list.stream().sorted(compare1).collect(Collectors.toList());
		System.out.println("Descending sorting based on length" + list4);
	}
}
