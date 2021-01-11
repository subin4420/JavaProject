package practice1;

public class Computer implements Controllable {
	Computer(){}
	
	public void turnOn() {
		System.out.println("컴퓨터를 켠다");
	}
	public void turnOff() {
		System.out.println("컴퓨터를 끈다");
	}
}
