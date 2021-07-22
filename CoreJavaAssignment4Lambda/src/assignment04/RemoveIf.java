package assignment04;

import java.util.ArrayList;

public class RemoveIf 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("MS D");
		list.add("is");
		list.add("the");
		list.add("best");
		list.add("finisher");
		System.out.println(list);
		list.removeIf(s->(s.length()%2)!=0);
		System.out.println(list);
	}
}
