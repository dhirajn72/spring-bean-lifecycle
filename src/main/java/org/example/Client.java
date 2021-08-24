package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanClass beanClass = (BeanClass) applicationContext.getBean("beanClass");
		System.out.println("--------------------");
		beanClass.show();
		System.out.println("-------------------");
		//BeanClass beanClass1=new BeanClass();


		applicationContext.registerShutdownHook();

	}
}