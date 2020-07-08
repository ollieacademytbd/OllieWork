package com.qa.exceptions;

import java.util.Scanner;

public class exceptions3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

	}

	public static float divide(float x, float y) {
		try {

			throw new Exception();

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
		}
		return x / y;

	}

}
