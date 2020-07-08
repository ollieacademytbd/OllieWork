package com.qa.exceptions;

import java.util.Scanner;

public class exceptions {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input first number: ");
		int a = input.nextInt();
		System.out.println("Input second number: ");
		int b = input.nextInt();
		int d = (a / b);
		System.out.println();
		System.out.println("The division of a and b is " + d);

	}

}
