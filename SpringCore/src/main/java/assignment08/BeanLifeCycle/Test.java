package assignment08.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("assignment08/BeanLifeCycle/config.xml");
		Samosa s1=(Samosa) context.getBean("s1");	
		System.out.println(s1);	
		
		//registering shut down hook
		context.registerShutdownHook();  //this will first run destroy method 
	}
}
