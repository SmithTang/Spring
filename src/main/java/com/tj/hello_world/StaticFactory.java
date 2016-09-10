package com.tj.hello_world;

public class StaticFactory{
	public static IHello newInstance(String message) {
		return new Hello2(message);
	}
}
