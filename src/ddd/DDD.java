package ddd;
import java.util.*;
public class DDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		//Vector
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		printVector(v);

		//ArrayList가변 Array불변
		ArrayList <String> A = new ArrayList<String>();
		//HashMap <key, value> key는 중복 허용X
		HashMap<String, String> h = new HashMap<String, String>();
		
		
		
	}
	
	
		public static void printVector(Vector<Integer> v) {
			for(int i=0; i<v.size(); i++) {
				int n = v.get(i);
				System.out.println(n);
			}
		
		
	}

}
