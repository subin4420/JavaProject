package bbbb;
import java.util.*;
import java.lang.StringBuffer;
public class StringBuffertest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		StringBuffer sb = new StringBuffer(text);
		while(true) {
			System.out.print("���: ");
			String cmd = sc.nextLine();
			String[] stringsplit = cmd.split("!");
			if(stringsplit.length != 2) {
				System.out.print("�߸��� �Է��Դϴ�.");	
			}
			else {
				if(stringsplit[0].length() == 0 || stringsplit[1].length()==0) {
					System.out.print("�߸��� �Է��Դϴ�.");	
					continue;
				}
			}
			int index = sb.indexOf(stringsplit[0]);			
			if(index == -1) {
				continue;
			}//���� index, ���� index + stringsplit  �ٲ� ��Ʈ�� 
			sb.replace(index, index+stringsplit[0].length(), stringsplit[1]);
			System.out.println(sb.toString());	

		}
		
		
	
	}

}
