package com.javaex.ex01;

public class Ex04 {

	public static void main(String[] args) {
		
		char ch01 = 'a';
		char ch02 = '한';
		char ch03 = 56;
		
		System.out.println(ch01);
		System.out.println(ch02);
		System.out.println("56의 값은?"+ ch03);
		System.out.println("***↓↓↓↓String형*****");
		
		String ch04 ="안녕하세용";
		
		System.out.println(ch04);
		
		//상수 = 값을 변환하지 못하게 고정시킴
		final double PI = 3.14;
		double result=PI*5*5;
		System.out.println(result);
		
		
		result = PI*5*5;
		System.out.println(result);
	}
	
}
