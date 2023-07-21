package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Create a list and Filter a even numbers from list
public class StreamMain1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(20);
		list.add(35);
		list.add(40);

		for (int x : list) {
			if (x % 2 == 0) {
				System.out.println(x);
			} else {
				continue;
			}

		}

		// using stream API
		/*
		 * Stream<Integer> stream = list.stream();
		 * 
		 * List<Integer> newList= stream.filter(i -> i % 2 ==
		 * 0).collect(Collectors.toList());
		 */

		List<Integer> newList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
		
        List<Integer> newList1 = list.stream().filter(i -> i > 10).collect(Collectors.toList());
		System.out.println(newList1);
		
 	}
}
