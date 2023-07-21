package com.stream.apii;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;



public class StreamOfMethod {


	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(9,99,999,9999);
		stream.forEach(System.out::println);
		
		Integer[]a= {10,20,30,40,50};
		Stream.of(a).forEach(i->System.out.println(i));
	}
}
