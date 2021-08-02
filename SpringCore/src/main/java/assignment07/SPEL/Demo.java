package assignment07.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{10+10}")
	private int X;
	@Value("#{3+19+78}")
	private int Y;
	
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	
	@Override
	public String toString() {
		return "demo [X=" + X + ", Y=" + Y + "]";
	}
}
