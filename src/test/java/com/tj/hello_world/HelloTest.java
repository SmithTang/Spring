package com.tj.hello_world;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tj.DI.DependentBean;

public class HelloTest {
	@Test
	public void test() {

		// 1、读取配置文件实例化一个IoC容器
		ApplicationContext context = new ClassPathXmlApplicationContext("helloBean.xml");
		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
		IHello hello = context.getBean("realfactinstance", IHello.class);
		// 3、执行业务逻辑
		hello.printHello();
		// fail("Not yet implemented");
	}

	@Test
	public void test2() {
		// 1、读取配置文件实例化一个IoC容器
		ApplicationContext context = new ClassPathXmlApplicationContext("helloBean.xml");
		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
		IHello hello = context.getBean("byIndex", IHello.class);
		// 3、执行业务逻辑
		hello.printHello();

		IHello hello1 = context.getBean("byType", IHello.class);
		// 3、执行业务逻辑
		hello1.printHello();

		IHello hello2 = context.getBean("byName", IHello.class);
		// 3、执行业务逻辑
		hello2.printHello();
	}

	@Test
	public void test3() {
		// 1、读取配置文件实例化一个IoC容器
		ApplicationContext context = new ClassPathXmlApplicationContext("helloBean.xml");
		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
		IHello hello = context.getBean("setter", IHello.class);
		// 3、执行业务逻辑
		hello.printHello();
	}

	@Test
	public void test4() {
		// 1、读取配置文件实例化一个IoC容器
		ApplicationContext context = new ClassPathXmlApplicationContext("helloBean.xml");
		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
		IHello hello = context.getBean("ref", IHello.class);
		// 3、执行业务逻辑
		hello.printHello();
	}

	@Test
	public void test5() {
		// 1、读取配置文件实例化一个IoC容器
		ApplicationContext context = new ClassPathXmlApplicationContext("helloBean.xml");
		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
		IHello hello = context.getBean("list", IHello.class);
		// 3、执行业务逻辑
		hello.printHello();
	}

}
