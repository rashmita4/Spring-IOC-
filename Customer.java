package com.example.practice1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	public static void main(String args[]) {
		
		ApplicationContext appctx=new ClassPathXmlApplicationContext("beans.xml");
		
		Airtel air=(Airtel) appctx.getBean("air");
		air.airtelSer();
	}

}
