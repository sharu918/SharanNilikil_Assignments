package assignment02;

import java.util.LinkedHashSet;
import java.util.Iterator;

//the elements will be iterated in the insertion order.
public class LinkedHashSetDemo 
{
	public static void main(String args[]){    
        LinkedHashSet<String> lh=new LinkedHashSet();     
               lh.add("Ajit"); 
               lh.add("Bob");      
               lh.add("Cane");     
               lh.add("Dave");    
               lh.add("Erin");    
               Iterator<String> i=lh.iterator();  
               while(i.hasNext())    
               {    
               System.out.println(i.next());    
               }    
 }    
}
