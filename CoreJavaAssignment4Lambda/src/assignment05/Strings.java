package assignment05;

import java.util.ArrayList;
import java.util.List;

public class Strings {

	public static void main(String[] args) 
	{
		StringBuilder result=new StringBuilder();
		List<String> list= new ArrayList<String>();
		
		list.add("Sharan");
		list.add("Swetha");
		list.add("Vamsi");
		list.add("Rajesh");
		list.add("Yogitha");
		list.add("Karthik");
		list.add("Ruthvika");
		
		list.forEach(a->result.append(a.charAt(0)));
		
		System.out.println(result);
	}

}
