package com.stream.api;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		
		//Stream API -collection process
		//Collection / group of Object / array
		
		//1 way- blank Stream
		Stream<Object> emptyStream =Stream.empty();
		String[]name= {"Bhushan", "Ghodke", "Prashant"};
		
		Stream<String >stream1= Stream.of(name);
	    stream1.forEach(e->System.out.println(e));
	  
       
	}
}
