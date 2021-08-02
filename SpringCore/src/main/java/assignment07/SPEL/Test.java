package assignment07.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("assignment07/SPEL/config.xml");
		Demo d=(Demo) context.getBean("demo");
		System.out.println(d);
	}

}
