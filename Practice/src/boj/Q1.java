package boj;
import java.util.*;

public class Q1 {
	public static void main(String [] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("1~100사이의 정수를 입력하세요");
		int input=sc.nextInt();
		System.out.println("숫자를 "+input+" 개 입력하세요" );
		String input2=sc.next();

	int sum=0;
	for(int i=0;i<input2.length();i++) {
	int q1=Character.getNumericValue(input2.charAt(i));
	sum+=q1;
	}
	System.out.print(sum);

	}

}
