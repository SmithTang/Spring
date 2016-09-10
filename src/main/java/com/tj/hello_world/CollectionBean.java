package com.tj.hello_world;

import java.util.List;

public class CollectionBean implements IHello {
	
	private List<String> messages;

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public void printHello() {
		System.out.print("Messages: ");
		for(String each:messages) {
			System.out.print(each+" ");
		}
	}

}
