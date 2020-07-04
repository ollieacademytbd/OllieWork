package com.qa.lambdas;

public class Lambdas {

	public static void main(String[] args) {

		Hello h = () -> {
			System.out.println("Hello World");
		};

		h.speak();
	}

	interface Hello {
		void speak();

	}

}
