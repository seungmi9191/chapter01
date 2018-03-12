package practice01;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

/**
 * 
 * @author woo seung mi 
 * 연습문제 8
 */

public class Problem08 {

	public static void main(String[] args) {
		
		int num; //메뉴 선택
		int sumcash = 0; //입력값을 담을 변수
		int balance = 0; //잔고
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("----------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
			

			if(num==1) {
				System.out.print("예금액> ");
				sumcash += sc.nextInt(); //sumcash에 입력금액 저장 및 더함
				System.out.println(sumcash+"원 입금");
				//System.out.println(sumcash);
				
			} else if(num==2) {
				System.out.print("출금액> ");
				sumcash -= sc.nextInt(); //sumcash에 입력금액 저장 및 뺌
				System.out.println(sumcash+"원 출금");
				//System.out.println(sumcash);
				
			} else if(num==3) {
				balance = sumcash;
				System.out.println("잔고액> " + balance+"원");
				
			} else if(num==4) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println();
		}
		sc.close();

	}

}
