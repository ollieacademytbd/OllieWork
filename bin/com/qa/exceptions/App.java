package com.qa.exceptions;

public class App {

	public static void main(String[] args) {

		try {

			int[] mynumbers = { 1, 2, 3 };
			System.out.println(mynumbers[10]);

		} catch (Exception e) {
			System.out.println("We have aproblem");
		} finally {
			System.out.println("We are still going");
		}

	}

	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied");

		} else {
			System.out.println("access granted");
		}
	}
}
