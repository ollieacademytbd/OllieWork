package com.qa.open_Close;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greets = new Greeter(new Casualgreeting());
		System.out.println(greets.greet());

		greets.setGreeting(new Formalgreeting());
		System.out.println(greets.greet());

	}

}
