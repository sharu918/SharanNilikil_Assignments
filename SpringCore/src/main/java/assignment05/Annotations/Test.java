package assignment05.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("assignment05/Annotations/config.xml");
		 
	    Employee emp = ac.getBean("myemployee", Employee.class);
	    System.out.println(emp.toString());
	}

}
