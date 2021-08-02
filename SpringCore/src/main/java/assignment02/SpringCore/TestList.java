package assignment02.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment02/SpringCore/config.xml");
		QuestionList ques = (QuestionList) context.getBean("q1");
		
		System.out.println(ques);
	}
}
