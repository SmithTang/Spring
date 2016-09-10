package com.tj.hello_world;

public class RealFactory {
	public IHello newInstance(String message) {
		return new Hello2(message);
	}
}
