package com.qa.exceptions;

public class exceptions2 {

	public static void main(String[] args);

	public static int divide(int num1, int num2) {

		try {

			if (num1 < num2) {
				throw new Exception("Num2 is bigger than Num1");

			}
			return num1 / num2;
		} catch (ArithmeticException a) {
			System.out.println(a.toString());
		} catch (NumberFormatException n) {
			System.out.println(n.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return 0;

	}

}
