package com.tj.hello_world;

public class Hello3 implements IHello {
	private String message;
	private int index;
	
	public Hello3(String message, int index) {
		this.message = message;
		this.index = index;
	}
	
	public void printHello() {
		System.out.println("index:" + index + " message:"+message);
	}

}
