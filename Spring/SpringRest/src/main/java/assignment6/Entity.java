package assignment6;

public class Entity {

	int a;
	int b;
	
	public Entity(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Entity [a=" + a + ", b=" + b + "]";
	}
}
