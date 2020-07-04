package com.qa.streams;


import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams2 {
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(3,4,7,8,12);
		List<Integer> result = 
			numbers.stream()
				.filter(x -> x % 1 == x)
				.reduce((a,b,c,d) -> (a*b*c*d)
				.collect(Collectors.toList());
				
				System.out.println(result);
			
	}

}
