package com.javaex.ex02;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		int num;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
	/*	do {	
			num = sc.nextInt();
			
			sum += num;
			System.out.println("합계: " + sum);
			
		} while(num!=0); //이 부분 다시 생각하기! //0이 아닐때 계속 반복함 		
*/		
		
		while(true) {
			
			num = sc.nextInt();
			
			sum += num;
			System.out.println("합계: " + sum); 
			if(num==0) {
				break;
			}
			
		}
		System.out.println("종료");
		sc.close();
	}

}
