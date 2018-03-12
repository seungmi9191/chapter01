package com.javaex.ex02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		int i = 1;

		for (i = 1; i <= 20; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			} 
			System.out.println(i);
		}
	}
}
