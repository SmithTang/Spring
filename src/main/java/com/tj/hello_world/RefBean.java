package com.tj.hello_world;

public class RefBean implements IHello{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printHello() {
		// TODO Auto-generated method stub
		System.out.println("ID:"+id);
	}
}
