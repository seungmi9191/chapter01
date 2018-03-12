package com.javaex.ex02;

import java.util.Scanner;

/*
 * 2018.03.08~09 [조건문] ppt 01-64
 */

public class Ex05 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
	    if(num>0) {
			if (num%2==0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else if(num<0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		
		//아래 코드는 순서도 자체가 복잡해짐
		/*if((num>0) && (num%2==0)) {
			System.out.println("짝수입니다.");
		} else if((num>0) && (num%2!=0)) {
			System.out.println("홀수입니다.");
		} else if(num<0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}*/
		sc.close();
	}

}
