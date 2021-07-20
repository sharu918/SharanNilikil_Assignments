package assignment06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Replace 
{
	public static void main(String[] args) 
	{
		List<String> list= new ArrayList<String>();
		UnaryOperator<String> unaryOperator=a->a.toUpperCase();
		
		list.add("Sharan");
		list.add("Swetha");
		list.add("Vamsi");
		list.add("Rajesh");
		list.add("Yogitha");
		list.add("Karthik");
		list.add("Ruthvika");
		
		list.replaceAll(unaryOperator);
		list.forEach(System.out::println);
	}
}
