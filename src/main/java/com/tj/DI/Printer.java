package com.tj.DI;

public class Printer {
	private int counter = 0;

	public void print(String type) {
		System.out.println(type + " printer: " + counter++ + this.toString());
	}
}