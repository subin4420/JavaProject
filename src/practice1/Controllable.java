package practice1;

public interface Controllable {
		default void repair() {
			System.out.println("수리");
		}
		static void reset() {//메소드
			System.out.println("초기화");
		}
		public void turnOn();//틀
		public void turnOff();
}
