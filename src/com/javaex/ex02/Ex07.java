package com.javaex.ex02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		System.out.println("과목을 선택하세요.");
		System.out.println("(1.자바   2.C  3.C++  4.파이썬)");
		System.out.print("");
		
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		
		switch(code) {
		
		case 1 : 
			System.out.println("R101호 입니다.");
			break;
			
		case 2 : 
			System.out.println("R202호 입니다.");
			break;
			
		case 3 : 
			System.out.println("R303호 입니다.");
			break;
			
		case 4 : 
			System.out.println("R404호 입니다.");
			break;
			
		default :
			System.out.println("상담원에게 문의하세요.");
			break;	
		}
		
		sc.close();
		
	}

}
