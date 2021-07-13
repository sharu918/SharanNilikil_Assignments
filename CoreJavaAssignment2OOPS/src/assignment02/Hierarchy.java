package assignment02;


class Employee
{
	private double salary;
	public Employee(double salary)
	{
		this.salary = salary;
	}
	public double getsalary()
	{
		return salary;
	}
}

class Manager extends Employee
{
	public double incentive;
	public Manager(double salary, double incentive)
	{
		super(salary);
		this.incentive = incentive;
	}
	
	@Override
	public double getsalary()
	{
		return super.getsalary()+incentive;
	}
}

class Labour extends Employee
{
	private double overtime;
	public Labour(double salary,double overtime)
	{
		super(salary);
		this.overtime=overtime;
	}
	
	@Override
	public double getsalary() 
	{
		return super.getsalary()+overtime;
	}
}

public class Hierarchy 
{
	public static void main(String args[]) 
	{
		Manager m=new Manager(50000,5000);
		Labour l=new Labour(15000,2000);
		System.out.println("Manager Salary : "+m.getsalary());
		System.out.println("Labour Salary : "+l.getsalary());
	}
}
