package assignment02.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment02/SpringCore/config.xml");
		QuestionSet ques = (QuestionSet) context.getBean("q3");
		
		System.out.println(ques);
	}
}
