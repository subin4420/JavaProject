package aaaa;

public class Circle {
	private int x;
	private int y;
	private int radius;
	public Circle(int x, int y, int radius) {
		this.x =x;
		this.y=y;
		this.radius=radius;
	}
	
	public String toString() {
		String A = "Circle(" + x+"," +y + ");// -> 반지름 "+radius;
		return A;
	}
	public boolean equal(Object A) {//넓은 범위로 받음
		Circle b=(Circle)A;//받은 걸 Circle로 형변환 해준다.
		if(this.x == b.x && y ==b.y) {
			return true;
		}
		else
			return false;
		
	}
}
