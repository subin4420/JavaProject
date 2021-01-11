package asdfasdf;
import java.util.*;

public class VectorBig {

	public static void printBig(Vector<Integer> A) {
		int biggerindex = 0;
		for(int i=0;i<A.size();i++) {
			if(A.get(i)>A.get(biggerindex))
				biggerindex = i;
		}
		System.out.println(A.get(biggerindex));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> A = new Vector<Integer>();
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(-1이 입력될 때까지) >>");
		while(true) {
			input = sc.nextInt();
			if(input == -1)
				break;
			A.add(input);
		}
		printBig(A);
		sc.close();
	}

}
