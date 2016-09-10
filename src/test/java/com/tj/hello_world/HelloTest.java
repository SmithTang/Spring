package com.tj.hello_world;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	@Test
	public void test() {
		// 1、读取配置文件实例化一个IoC容器
		ApplicationContext context = new ClassPathXmlApplicationContext("helloBean.xml");
		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
		IHello hello = context.getBean("realfactinstance", IHello.class);
		// 3、执行业务逻辑
		hello.printHello();
		//fail("Not yet implemented");
	}
}
