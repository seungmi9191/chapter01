package com.javaex.ex02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		boolean run = true;
		int num;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("숫자를 입력하세요.");
			num = sc.nextInt();
			
		    /*if(num==0) {
				System.out.println("종료");
				break;
			} else if(num%3==0) {
				System.out.println("3의 배수입니다.");
				//continue;
			} else {
				System.out.println("3의 배수가 아닙니다.");
				//continue;
			}*/
			

		    if(num%3==0) {
		    	System.out.println("3의 배수입니다.");
			} else if(num%3!=0) {
				System.out.println("3의 배수가 아닙니다.");
			} else if(num==0) {
				System.out.println("종료");
				break;
			}
		
		}
		sc.close();
	}

}
