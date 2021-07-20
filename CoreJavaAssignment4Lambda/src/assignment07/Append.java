package assignment07;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Append 
{
	public static void main(String[] args) 
	{
		StringBuilder result=new StringBuilder();
		Map<Integer, String> map= new TreeMap<>();
		map.put(1, "HI,");
		map.put(2, "This is Sharan.");
		map.put(3, "How are you?");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		entrySet.forEach(a->result.append(a));
		System.out.println(result);
	}
}
