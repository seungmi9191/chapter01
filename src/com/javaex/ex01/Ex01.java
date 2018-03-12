package com.javaex.ex01;

/*
 * 18.03.08(목) 실습
 */

public class Ex01 {

	public static void main(String[] args) {
		
		int myAge; //정수형 int -> 실행해야 메모리에 저장됨!
		myAge =25; //변수 myAge에 25 숫자 선언
		
		System.out.println(myAge); //변수 myAge 안에 있는 내용 출력
	    //여기서 저장하면 하드 디스크에만 저장됨
	   //실행버튼을 눌러야 메모리에 저장되어 출력됨
		
		/*int var01, var02, var03;*/
		
		int var01 = 10;
		int var02 = 123456;
		int var03 = 333333333;
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		
		byte bVar01;
		bVar01 = 127; //byte는 -128~127까지만 넣을 수 있다!
		
		long bVar02 = 123456789015234789L;
	}

}
