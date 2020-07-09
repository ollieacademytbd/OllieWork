package com.qa.enums;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double earthWeight = Double.parseDouble("175");
		double mass = earthWeight / Enums.EARTH.surfaceGravity();
		for (Enums p : Enums.values()) {
			System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
		}
	}
}
