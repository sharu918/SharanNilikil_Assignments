package assignment02;

import java.util.HashSet;
import java.util.Iterator;

//The elements will not be stored in an order.
public class HashSetDemo 
{
	public static void main(String args[])
	{    
        HashSet<String> h=new HashSet(); 
               h.add("Ajit"); 
               h.add("Bob");      
               h.add("Cane");     
               h.add("Dave");    
               h.add("Erin");  
               Iterator<String> i=h.iterator(); 
               while(i.hasNext()) 
               {    
               System.out.println(i.next());   
               }    
     }    
}
