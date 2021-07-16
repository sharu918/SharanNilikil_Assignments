package assignment01;

import java.util.SortedSet;
import java.util.TreeSet;


class Person implements Comparable<Person>
{
	private int weight;
	private double height;
	private String name;
	
	public Person(int value, double value1, String name)
	{
		this.weight = value;
		this.height = value1;
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}
	

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Person o)
	{
		return this.getWeight() - o.getWeight();
	}
	
	 @Override
	    public String toString() {
	        return "Person{" +
	                "name=" + name +
	                ", weight='" + weight + '\'' +
	                '}';
	    }
}

public class ClientPerson {

	public static void main(String[] args) {
		 
		SortedSet<Person> Persons = new TreeSet<>();
		Persons.add(new Person(60, 169, "Sam"));
		Persons.add(new Person(81, 183, "Ronaldo"));
		Persons.add(new Person(87, 175, "Daniel"));
		Persons.add(new Person(70, 157, "George"));
		         
        System.out.println("sorting Order with the Weight");
        System.out.println(Persons);
		         
	}

}
