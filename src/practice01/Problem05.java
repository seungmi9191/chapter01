package practice01;

import java.util.Scanner;

/**
 * 
 * @author woo seung mi 
 * 연습문제 5
 */

public class Problem05 {

	public static void main(String[] args) {
		
		//5개의 정수를 받을 변수 선언
		int a,b,c,d,e;
		String num = null; //종료조건
		
		//비교한 최대값을 받을 변수 선언
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
					
			System.out.println("숫자를 입력하세요.");
			
			System.out.print("숫자: ");
			a=sc.nextInt();
			
			System.out.print("숫자: ");
			b=sc.nextInt();
			
			System.out.print("숫자: ");
			c=sc.nextInt();
			
			System.out.print("숫자: ");
			d=sc.nextInt();
			
			System.out.print("숫자: ");
			e=sc.nextInt();
			
			System.out.println("----------------------------");
			
			if(a>=b && a>=c && a>=d && a>=e) {
				max=a;
			} else if (b>=a && b>=c && b>=d && b>=e) {
				max=b;
			} else if (c>=a && c>=b && c>=d && c>=e) {
				max=c;
			} else if (d>=a && d>=b && d>=c && d>=e) {
				max=d;
			} else if (e>=a && e>=b && e>=c && e>=d) {
				max=e;
			}
			
		    System.out.println("최대값은 " + max+ "입니다."+"\n");
		
		sc.close();
	}
}
