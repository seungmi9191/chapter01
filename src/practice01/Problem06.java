package practice01;

import java.util.Scanner;

/**
 * 
 * @author woo seung mi 연습문제 6
 */

public class Problem06 {

	public static void main(String[] args) {

		int sum = 0;
		int i;
		int num=1;
		int startNum;

		Scanner sc = new Scanner(System.in);

			System.out.println("숫자를 입력하세요.");
			System.out.println("-------------------");
			
			/*num = sc.nextInt();
			
			//입력한 수가 홀수인 경우 홀수의 합을 더하라.
			if(num%2!=0) {
				for(i=1; i<=num; i++) {
					if(i%2!=0) {
					// System.out.println(i);
					sum = sum + i; {
					}
				  }
				}
			} else {
				for(i=1;i<=num; i++) {
					if(i%2==0) {
					sum = sum + i;
					}
				}
			}
			
			System.out.println("결과값: "+sum+ "\n");
			}*/
		
			//이런 방법도 있을 수 있다. (강사님 풀이)
			num = sc.nextInt();
			
			if(num%2==0) {
				startNum = 2;
			} else {
				startNum = 1;
			}
			
			for(i=startNum; i<=num; i=i+2) {
				sum = sum + i;
			}
			System.out.println("결과값: " +sum);
			sc.close();
	}  
	 
}  
