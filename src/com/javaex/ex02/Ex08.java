package com.javaex.ex02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		System.out.println("월을 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		switch(month) {
		
		case 1: 
			System.out.println("31일입니다.");
			break;
			
		case 2: 
			System.out.println("28일입니다.");
			break;
			
		case 3: 
			System.out.println("31일입니다.");
			break;
			
		case 4: 
			System.out.println("30일입니다.");
			break;
			
		case 5: 
			System.out.println("31일입니다.");
			break;
			
		case 6: 
			System.out.println("30일입니다.");
			break;
			
		case 7: 
			System.out.println("31일입니다.");
			break;
			
		case 8: 
			System.out.println("31일입니다.");
			break;
			
		case 9: 
			System.out.println("30일입니다.");
			break;
			
		case 10: 
			System.out.println("31일입니다.");
			break;
			
		case 11: 
			System.out.println("30일입니다.");
			break;
			
		case 12: 
			System.out.println("31일입니다.");
			break;
			
		default: 
			System.out.println("1~12월까지만 입력가능합니다.");
			break;
			
		}
		
	}

}
