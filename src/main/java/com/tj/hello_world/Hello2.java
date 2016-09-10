package com.tj.hello_world;

public class Hello2 implements IHello {
	private String message;
	
	public void printHello() {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	
	public Hello2() {
		this.message = "default";
	}
	
	public Hello2(String input) {
		this.message = input;
	}

}
