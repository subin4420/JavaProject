package practice1;

public class Notebook extends Computer implements Controllable, Portable {

	@Override
	public void inMyBag() {
		// TODO Auto-generated method stub
		System.out.println("��Ʈ���� ���� �ȿ� �ִ�");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		super.turnOn();
		System.out.println("��Ʈ���� �Ҵ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

		System.out.println("��Ʈ���� ����");
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
