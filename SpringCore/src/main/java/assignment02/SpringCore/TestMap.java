package assignment02.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment02/SpringCore/config.xml");
		QuestionMap ques = (QuestionMap) context.getBean("q2");
		
		System.out.println(ques);
	}
}
