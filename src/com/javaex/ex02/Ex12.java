package com.javaex.ex02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		int dan;
		int i = 1;
		/*int result = 1; //어차피 값이 0이 나오지는 않으니까 초기값은 1
		
		System.out.println("단을 입력해주세요.");
		System.out.print("단: ");
		
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();
		
		while(i<10) { //(i<=9)로 조건식을 줄 수도 있다!
			result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);
			i++;
		}
		
		sc.close();*/
		
		//for문
		System.out.println("단을 입력해주세요.");
		System.out.print("단: ");
		
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();
		
		for(i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		sc.close();
	}

}
