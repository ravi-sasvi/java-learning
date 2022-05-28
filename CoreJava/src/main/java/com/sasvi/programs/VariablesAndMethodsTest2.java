package com.sasvi.programs;

import com.sasvi.classes.Car;

public class VariablesAndMethodsTest2 {

	public static void main(String[] args) {
		printNameRavi();
		System.out.println("ravi");
		createAndPrintCarObject(); // calling the method
		System.out.println("ravi");
		printNameSarath();
		System.out.println("ravi");

		printNumbers1ToN(50);

	}

	// methods
	public static void createAndPrintCarObject() {
		Car mazdaCar = new Car();
		mazdaCar.setCompany("mazda");
		mazdaCar.setModel("cx-5");
		mazdaCar.setPrice(20000);
		System.out.println(mazdaCar.getPrice());
		System.out.println(mazdaCar.getCompany());
	}

	public static void printNameRavi() {
		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");
		System.out.println("ravi");

	}

	public static void printNameSarath() {
		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");
		System.out.println("sarath");
	}

	public static void printNumbers1To100() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	public static void printNumbers1ToN(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	public static void printEvenNumbers1To100() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	public static void printNameSaswith() {
		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");
		System.out.println("saswith");

	}

	public static void printNameSuhavi() {
		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");
		System.out.println("suhavi");
	}

}
