	package com.javaex.ex02;

public class Ex15 {

	public static void main(String[] args) {

		int i = 1;

		while (true) {

			if ((i%6==0) && (i%14==0)) {
				System.out.println(i);
				break;
			}
				i++;
			}

		}
	}

