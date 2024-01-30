package com;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println("Hello Rahul");
       
		//Resource r=new ClassPathResource("application.xml");
		
		//BeanFactory b=new XmlBeanFactory(r);
		
		ApplicationContext app=new ClassPathXmlApplicationContext("application.xml");
		
		Employee e1=(Employee) app.getBean("emp");
		
		Student s=(Student) app.getBean("stud");
		
		System.out.println(s.toString());
		
		
		
	}
     
	
}
