package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//if문 시작
		if(num>0) {
			System.out.println("양수");
		} else if(num<0) {
			System.out.println("음수");
		} else {
			System.out.println("0입니다.");
		}
		
		sc.close();
	}

}
