package assignment01.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment01/SpringCore/config.xml");
		Customer temp = (Customer) context.getBean("cref");
		System.out.println(temp.getCustomerId());
		System.out.println(temp.getCustomerName());
		System.out.println(temp.getCustomerContact());
		
		System.out.println(temp.getOb().getStreet());
		System.out.println(temp.getOb().getState());
		System.out.println(temp.getOb().getCity());
		System.out.println(temp.getOb().getZip());
		System.out.println(temp.getOb().getCountry());
		
		
	}

}
