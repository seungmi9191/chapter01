package com.javaex.ex02;

import java.util.Scanner; //import = 다른 곳에 있는 라이브러리를 갖다 쓸 때 사용

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키보드 연결\
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		System.out.println("입력한 값은 " + num +"입니다.");
		sc.close();
	}

}
