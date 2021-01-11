package qwe22;
import java.util.*;
public class HashMapNation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> A = new HashMap<>();
		String cmd;
		String nation;
		int pop;
		System.out.println("나라이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true) {
			System.out.print("나라이름, 인구 >> ");
			nation = sc.next();
			if(nation.equals("그만"))
				break;
			pop = sc.nextInt();
			
			A.put(nation, pop);
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			cmd = sc.next();
			
			if(cmd.equals("그만"))
				break;
			if(A.get(cmd)!=null) {
				System.out.println(A.get(cmd));

			}
			else
				System.out.println("없음"
						+ " ");

			
		}
		sc.close();
	
	}

}
