package com.qa.streams;

import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streasm3 {
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(3,6,8,12,15);
		List<Integer> result = 
				number.stream()

				.mapToInt(s -> s)
				.max(Comparator
				
		System.out.println(result);
	}
	
	

}
