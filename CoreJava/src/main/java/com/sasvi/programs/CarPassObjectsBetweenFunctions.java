package com.sasvi.programs;

import com.sasvi.classes.Car;

public class CarPassObjectsBetweenFunctions {

	// name - main
	// return type - void - does not return any value
	// input - String[] args
	// static - class level method
	// public - access specifier - can be accessed outside of this class
	public static void main(String[] args) {

		// Create Car objects
//		Car mazda = new Car();
//		mazda.setCompany("mazda");
//		mazda.setCompany("mazda");
//		mazda.setModel("cx-5");
//		mazda.setPrice(20000);
//
//		displayCarInfo(mazda);
//
//		Car rdx = new Car();
//		rdx.setCompany("accura");
//		rdx.setModel("rdx");
//		rdx.setPrice(30000);
//
//		displayCarInfo(rdx);
//		

		Car mazda = createCarInfo("mazda", "cx-5", 20000);

		displayCarInfo(mazda);

		Car accura = createCarInfo("accura", "rdx", 30000);
		displayCarInfo(accura);

		Car honda = createCarInfo("hona", "crv", 30000);

		displayCarInfo(honda);

	}

	public static Car createCarInfo(String comapny, String model, int price) {
		Car car = new Car();
		car.setCompany(comapny);
		car.setModel(model);
		car.setPrice(price);

		return car;
	}

	public static void displayCarInfo(Car carObject) {
		carObject.setPrice(30000);
		System.out.println("comapnay=" + carObject.getCompany());
		System.out.println("model=" + carObject.getModel());
		System.out.println("price=" + carObject.getPrice());

	}

}
