package aaaa;

public class CircleTest {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("�� a : " + a);

		System.out.println("�� b : " + b);
		if(a.equal(b)) 
			System.out.println("������");
		else
			System.out.println("�ٸ���");
	}

}
