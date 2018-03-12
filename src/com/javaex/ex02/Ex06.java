package com.javaex.ex02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		System.out.println("과목을 선택하세요.");
		System.out.println("(1.자바    2.C  3.C++  4.파이썬)");
		System.out.print("과목번호: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println("R101호입니다.");
		} else if(num==2) {
			System.out.println("R202호입니다.");
		} else if(num==3) {
			System.out.println("R303호입니다.");
		} else if(num==4) {
			System.out.println("R404호입니다.");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}
		sc.close();
	} 

}
