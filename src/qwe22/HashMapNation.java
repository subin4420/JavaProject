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
		System.out.println("�����̸��� �α��� �Է��ϼ���.(��: Korea 5000)");
		while(true) {
			System.out.print("�����̸�, �α� >> ");
			nation = sc.next();
			if(nation.equals("�׸�"))
				break;
			pop = sc.nextInt();
			
			A.put(nation, pop);
		}
		while(true) {
			System.out.print("�α� �˻� >> ");
			cmd = sc.next();
			
			if(cmd.equals("�׸�"))
				break;
			if(A.get(cmd)!=null) {
				System.out.println(A.get(cmd));

			}
			else
				System.out.println("����"
						+ " ");

			
		}
		sc.close();
	
	}

}
