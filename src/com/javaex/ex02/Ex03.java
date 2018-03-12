package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/*조건문 사용하기*/
		
		//Q1. 점수를 입력받아 점수가 60점 이상이면 "합격입니다."를 출력하세요.
		
		//점수를 입력받을 스캐너 생성
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		//점수 조건 처리
		if(score>=60) {	
			System.out.println("합격입니다.");
		} else {//if에서 통과하지 못하는 경우 전체 모두를 포함 
			System.out.println("불합격입니다.");
	    }	
		
		sc.close();
		
	}

}
