package assignment05;

abstract class Shape
{
	abstract String draw();
}

class Line extends Shape
{

	@Override
	String draw() 
	{		
		return "Drawing a Line";	
	}	
}

class Rectangle extends Shape
{

	@Override
	String draw()
	{
		return "Drawing a Rectangle";
	}
}

class Cube extends Shape
{

	@Override
	String draw() 
	{
		return "Drawing a Cube";
	}	
}

public class Shapes 
{
	public static void main(String[] args) 
	{
		Shape shape=new Line();
		System.out.println(shape.draw());
		
		Shape shape1=new Rectangle();
		System.out.println(shape1.draw());
		
		Shape shape2=new Cube();
		System.out.println(shape2.draw());	
	}
}
