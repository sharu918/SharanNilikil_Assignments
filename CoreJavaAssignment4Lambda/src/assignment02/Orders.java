package assignment02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Orders 
{
	public static void main(String[] args) 
	{		
		List<order> list=Arrays.asList(
				new order(1,1000,"ACCEPTED"),
				new order(2,2548,"ACCEPTED"),
				new order(3,6471,"ACCEPTED"),
				new order(4,1500,"COMPLETED"),
				new order(5,5480,"ACCEPTED"),
				new order(6,8000,"ACCEPTED"),
				new order(7,6482,"CANCELLED"),
				new order(8,2015,"ACCEPTED"),
				new order(9,8467,"COMPLETED"),
				new order(10,6574,"CANCELLED")
				);
		System.out.println("Order price more than 10000 : ");
		print(list,a->a.getPrice()>10000);
		System.out.println("Order status ACCEPTED or COMPLETED : ");
		print(list,a->a.getStatus().equalsIgnoreCase("accepted")||a.getStatus().equalsIgnoreCase("completed"));
	}
	private static void print(List<order> list,Predicate<order> predicate) 
	{
		list.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}
}


class order
{
	int order_id;
	double price;
	String status;
	public order(int order_id, double price, String status) 
	{
		this.order_id = order_id;
		this.price = price;
		this.status = status;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", price=" + price + ", status=" + status + "]";
	}
}