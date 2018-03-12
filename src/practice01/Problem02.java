package practice01;

import java.util.Scanner;

/**
 * 
 * @author woo seung mi 
 * 연습문제 2
 */

public class Problem02 {

	public static void main(String[] args) {

		int num;
		int i = 0;
		int j = 0;

		Scanner sc = new Scanner(System.in);
		
			while(true) {
				System.out.println("숫자를 입력하세요.");
				num = sc.nextInt();
				
				if(num==0) {
					break;
				}

				System.out.println("-------------");

				for (i = 1; i <= num; i++) {
					// System.out.println(i);
					for (j = 1; j <= i; j++) {
						System.out.print(i);
					}
					System.out.println();
				}
				System.out.println("-------------");
			}
			
		sc.close();
	}
		
}

