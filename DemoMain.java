package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext context= new AnnotationConfigApplicationContext(Javaconfig.class);
          Student s1=(Student)context.getBean("firststudent",Student.class);
          System.out.println(s1);
          s1.study();
          
	}

}
