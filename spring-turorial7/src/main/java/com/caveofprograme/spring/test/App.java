package com.caveofprograme.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/caveofprograme/spring/test/beans/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprograme/spring/test/beans/beans.xml");
		
		Person person = (Person) context.getBean("person");
		person.speak();
		
//		((FileSystemXmlApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context).close();
	}

}
