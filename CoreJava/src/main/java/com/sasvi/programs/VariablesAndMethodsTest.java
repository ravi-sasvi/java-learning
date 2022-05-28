package com.sasvi.programs;

import com.sasvi.classes.Car;

public class VariablesAndMethodsTest {

	public static void main(String[] args) {

		// variables

		String course = "java";
		int bookCost = 20;
		int zipCode = 75234;
		boolean saswithBoy = true;
		float tablePrice = 25.5f;

		System.out.println(course);

		Car mazdaCar = new Car();
		mazdaCar.setCompany("mazda");
		mazdaCar.setModel("cx-5");
		mazdaCar.setPrice(20000);
		System.out.println(mazdaCar.getPrice());
		System.out.println(mazdaCar.getCompany());

		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");

		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");

		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
