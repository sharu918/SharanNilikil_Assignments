package assignment05.Annotations.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("assignment05/Annotations/inject/config.xml");
		Employee emp=(Employee) context.getBean("emp");
		System.out.println(emp);
	}
}
