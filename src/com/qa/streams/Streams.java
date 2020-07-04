package com.qa.streams;


import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Streams {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		
		names.stream().filter(x->x!= "James").forEach(x-> System.out.println("Hello: " + x ));
			
	}
	


}
