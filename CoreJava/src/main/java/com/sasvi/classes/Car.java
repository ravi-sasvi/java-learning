package com.sasvi.classes;

//Represents the structue of car objects
public class Car {

	// object variables
	private String company;
	private String model;
	private int price;

	private static int objectsCount = 0;

	// Constructors - they are used to create objects
	public Car() {
		System.out.println("I am in car constructor *******");
	}

	public Car(String company, String model, int price) {
		super();
		this.company = company;
		this.model = model;
		this.price = price;
	}

	// Object method - These are used to set the info to the object and get the info
	// from object
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getObjectsCount() {
		return objectsCount;
	}

	public static void setObjectsCount(int objectsCount) {
		Car.objectsCount = objectsCount;
	}

}
