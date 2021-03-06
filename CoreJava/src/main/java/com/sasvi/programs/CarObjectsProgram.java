package com.sasvi.programs;

import com.sasvi.classes.Car;

public class CarObjectsProgram {

	// name - main
	// return type - void - does not return any value
	// input - String[] args
	// static - class level method
	// public - access specifier - can be accessed outside of this class
	public static void main(String[] args) {

		// Create Car objects
		Car mazda = new Car();
		mazda.setCompany("mazda");
		mazda.setCompany("mazda");
		mazda.setModel("cx-5");
		mazda.setPrice(20000);

		Car.setObjectsCount(1);

		Car rdx = new Car();
		rdx.setCompany("accura");
		rdx.setModel("rdx");
		rdx.setPrice(30000);

		Car.setObjectsCount(2);

		System.out.println(mazda.getPrice());
		System.out.println(mazda.getCompany());
		System.out.println(mazda.getPrice());

		mazda.displayCarInfo();

		rdx.displayCarInfo();

		System.out.println(rdx.getPrice());
		System.out.println(rdx.getCompany());
		System.out.println(rdx.getPrice());

	}

}
