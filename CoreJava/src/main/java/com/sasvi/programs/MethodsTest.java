package com.sasvi.programs;

public class MethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printNumbers1ToN(10);
		// add(5, 7);

		int sum1 = add2(10, 20);
		System.out.println(sum1);

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

	public static void add(int a, int b) {
		int sum = a + b;

		System.out.println(sum);
	}

	public static int add2(int a, int b) {
		int sum = a + b;

		return sum;
	}

}
