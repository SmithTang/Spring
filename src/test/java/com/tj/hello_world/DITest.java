package com.tj.hello_world;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tj.DI.DependentBean;
import com.tj.DI.MethodInject;

public class DITest {

	@Test
	public void testDependOn() throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("helloBean.xml");
		// 一点要注册销毁回调，否则我们定义的销毁方法不执行
		context.registerShutdownHook();
		DependentBean dependentBean = context.getBean("dependentBean", DependentBean.class);
		dependentBean.write("aaa");
	}
	
	@Test
	public void testMethod(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("helloBean.xml");
		System.out.println("=======singleton sayHello======");  
        MethodInject methodInject1 = context.getBean("singleton", MethodInject.class);  
        methodInject1.printHello();
        methodInject1 = context.getBean("singleton", MethodInject.class);  
        methodInject1.printHello();  
        
        System.out.println("=======prototype sayHello======");  
        MethodInject helloApi2 = context.getBean("prototype", MethodInject.class);  
        helloApi2.printHello();  
        helloApi2 = context.getBean("prototype", MethodInject.class);  
        helloApi2.printHello();  
	}
}
