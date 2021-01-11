package asdfasdfww;
import java.util.*;

public class ArrayListScore {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> A = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		
		char input;
		double sum=0;
		double score=0;
		System.out.print("6개 학점입력하시오 ");
		for(int i=0;i<6;i++) {
			
			input = sc.next().charAt(0);
			if(((int)input>=(int)'A'&&(int)input<=(int)'F') ||((int)input>=(int)'a'&&(int)input<=(int)'f'))
				A.add(input);
			else if(input=='E'|| input=='e')
			{
				System.out.println("잘못 입력하였습니다.");
				return;
			}
			
			else {
				System.out.println("잘못 입력하였습니다.");
				return;
			}
		}
		
		for(int i=0;i<6;i++) {
			if(A.get(i)=='A'||A.get(i)=='a') {
				sum=sum+4;
			}
			else if(A.get(i)=='B'||A.get(i)=='b')
			{
				sum=sum+3;
			}
			else if(A.get(i)=='C'||A.get(i)=='c')
			{
				sum=sum+2;
			}else if(A.get(i)=='D' ||A.get(i)=='d')
			{
				sum=sum+1;
			}
			else if(A.get(i)=='F'||A.get(i)=='f')
			{
				sum=sum+0;
			}

			
		}
		score = sum/6;
		System.out.print(score);
		sc.close();

	}
	
}
