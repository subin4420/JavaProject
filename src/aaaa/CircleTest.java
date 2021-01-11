package aaaa;

public class CircleTest {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a : " + a);

		System.out.println("원 b : " + b);
		if(a.equal(b)) 
			System.out.println("같은원");
		else
			System.out.println("다른원");
	}

}
