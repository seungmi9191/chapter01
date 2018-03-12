package practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		int average = 0;
		int sum = 0;
		int in;
		int i;
		
		Scanner sc = new Scanner(System.in); 
		
		int[] num = new int[5];
		
		for(i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		average = sum / num.length;
		System.out.println("평균은 "+average+"입니다.");
	}

}
