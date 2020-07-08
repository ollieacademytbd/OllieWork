package com.qa.liskov;

public class BedroomAdder {

	public void addBedroom(Penthouse penthouse) {
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 5);
	}
}
