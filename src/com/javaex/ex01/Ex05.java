package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 3;
		float c = 3.0f;
		
		/*System.out.println(a/b);
		System.out.println(a/c); */
		
		double dVar01 = 2 + 3.5;
		System.out.println(dVar01); //자동 형변환
		
		int i =(int)12.5;
		System.out.println(i); //강제 형변환
		
		//double이 int보다 커서 형변환이 자동으로 되지만 헷갈리면 쓰는것이 좋다.
		double dVar02 = (double)100; 
		                           
		System.out.println(dVar02);
	}
}
