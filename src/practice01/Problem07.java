package practice01;

import java.util.Scanner;

/**
 * 
 * @author woo seung mi 
 * 연습문제 7
 */

public class Problem07 {

	public static void main(String[] args) {
		
		//게임 라운드 하나가 끝나고 새로운 난수 발생하는 방법 다시 생각해보기
		
		int answer;
		String go;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========================");
		System.out.println("     [숫자 맞추기 게임 시작]    ");
		System.out.println("========================");
		
		int num = (int)(Math.random()*100)+1;

		while(true) {

			//System.out.println(num);
			System.out.print(">>");
			answer = sc.nextInt();
			
			if(num<answer) {
				System.out.println("더 낮게");
			} else if(num>answer) {
				System.out.println("더 높게");
			} else  {
				System.out.println("맞았습니다.");
				System.out.print("게임을 계속 진행하시겠습니까?(y/n)>> ");
				go = sc.next();
				if(go.equals("y")) {
					continue;
				} else if(go.equals("n")) {
					System.out.println("========================");
					System.out.println("     [숫자 맞추기 게임 종료]    ");
					System.out.println("========================");
					break;
				}
			}
		}
		sc.close();
	}
}
