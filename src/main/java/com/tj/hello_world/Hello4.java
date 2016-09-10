package com.tj.hello_world;

public class Hello4 implements IHello {
	private String message;
	private int index;

	public void printHello() {
		// TODO Auto-generated method stub
		System.out.println("index:" + index + " message:"+message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
