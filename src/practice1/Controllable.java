package practice1;

public interface Controllable {
		default void repair() {
			System.out.println("����");
		}
		static void reset() {//�޼ҵ�
			System.out.println("�ʱ�ȭ");
		}
		public void turnOn();//Ʋ
		public void turnOff();
}
