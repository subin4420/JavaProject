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
		String A = "Circle(" + x+"," +y + ");// -> ������ "+radius;
		return A;
	}
	public boolean equal(Object A) {//���� ������ ����
		Circle b=(Circle)A;//���� �� Circle�� ����ȯ ���ش�.
		if(this.x == b.x && y ==b.y) {
			return true;
		}
		else
			return false;
		
	}
}
