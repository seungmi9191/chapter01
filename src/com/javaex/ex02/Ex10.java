package com.javaex.ex02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		System.out.print("점수를 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A등급입니다.");
		} else if(score>=80) {
			System.out.println("B등급입니다.");
		} else if(score>=70) {
			System.out.println("C등급입니다.");
		} else if(score>=60) {
			System.out.println("D등급입니다.");
		} else {
			System.out.println("F등급입니다.");
		}
		 
		sc.close();
	}

}
