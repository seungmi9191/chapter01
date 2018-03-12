package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		//boolean형
		
		int a = 5;
		int b = 7;
		
		//false && true  ==> false
		System.out.println((a>b) && (a<b)); //연산순서 헷갈릴 땐 명확히 표시하기!
		
		//false && false ==> false
		System.out.println((a>b) && (a>b));
		
	
		System.out.println("============================");
		System.out.println("안녕\"하\"세요");
	
		//false || true ==> true
		System.out.println((a>b) || (a<b));

	}

}
