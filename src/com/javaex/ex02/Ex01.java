package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		int i =2345;
		double d = 3.14;
		String hi = "굿모닝:)";
		String name = "우승미";
		
		System.out.println("안녕하세요.");
		System.out.println(hi);
		System.out.println("안녕\n"+"하세요"); //+는 문자열 붙여주기
		System.out.println(hi + i);
		System.out.println(hi + d);
		System.out.println(hi + " " + i);
		System.out.println(hi + "   랑" + i);
		
		System.out.println("제 이름은 " + name + " 입니다.");
		
		System.out.println("------------------------------");	
		
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println("안녕\"하세요");
		System.out.println("안녕\\하세요");
	}

}
