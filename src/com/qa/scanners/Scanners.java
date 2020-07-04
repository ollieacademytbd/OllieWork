package com.qa.scanners;

import java.util.Scanner;

public class Scanners {
	public static void main(String[] args) {
		
//		String myStr = s.nextLine();
//		System.out.println("You entered: " + myStr);
		
		System.out.println("Enter a number between 1 and 12: ");
		Scanner s = new Scanner(System.in);
		int month;
		
		while (month<1 || month>12){
			
			while (!s.hasNextInt()) {
			month = s.nextInt();
			System.out.println("Invalid, pick a  number between 1 and 12");
			}
		} 
		
		System.out.println("You entered: " + month);
		
		switch(month) {
		case 1: 
			System.out.println("Jan");
			break;
			
		case 2:
			System.out.println("Feb");
			break;
		}
		
	}

}
