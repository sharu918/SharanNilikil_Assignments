package assignment08.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExample 
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("assignment08/BeanLifeCycle/config2.xml");
		
		//registering shut down hook
		context.registerShutdownHook();  //this will first run destroy method 
		Example example=(Example)context.getBean("e1");
		System.out.println(example);
	}
}
