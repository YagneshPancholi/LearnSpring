package com.springCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp
{
	@SuppressWarnings("resource")
	public static void main(String[] ar)
	{

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/collections/collection_config.xml");
		Employee emp = (Employee) context.getBean("emp1");
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getCourses());
	}
}
