package assignment03;

import java.util.ArrayList;
import java.util.ListIterator;
public class Reverse 
{
	public static void main(String[] args) 
	{
	      ArrayList<Integer> List = new ArrayList<Integer>();
	      List.add(1);
	      List.add(2);
	      List.add(3);
	      List.add(4);
	      List.add(5);
	      ListIterator<Integer> li = List.listIterator();
	      while (li.hasNext()) 
	      {
	         li.next();
	      }
	      System.out.println("The ArrayList elements in the reverse direction are: ");
	      while (li.hasPrevious()) 
	      {
	         System.out.println(li.previous());
	      }
	   }
}

