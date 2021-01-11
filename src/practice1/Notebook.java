package practice1;

public class Notebook extends Computer implements Controllable, Portable {

	@Override
	public void inMyBag() {
		// TODO Auto-generated method stub
		System.out.println("≥Î∆Æ∫œ¿∫ ∞°πÊ æ»ø° ¿÷¥Ÿ");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		super.turnOn();
		System.out.println("≥Î∆Æ∫œ¿ª ƒ“¥Ÿ");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

		System.out.println("≥Î∆Æ∫œ¿ª ≤ˆ¥Ÿ");
	}

	public static void main(String[] args) {
		Notebook n = new Notebook();
		
		n.repair();
		Controllable.reset();
		n.turnOn();
		n.turnOff();
		n.inMyBag();
		
	}
}
