package practice02;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {

		int[] moneyArr = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		String[] unitArr = new String[] { "오만원", "만원", "오천원", "천원", "오백원", "백원", "오십원", "십원", "오원", "일원" };

		Scanner sc = new Scanner(System.in);
    	System.out.print("금액: ");

		int money = sc.nextInt();
		int count;

		for (int i = 0; i < moneyArr.length; i++) {
			count = money / moneyArr[i];
			System.out.println("카운트:" + count);
			money -= count * moneyArr[i];
			System.out.println("돈:" + money);
			System.out.println("-------------------");
			// System.out.println(moneyArr[i] + "원" + " : " + count + "개");
		}
		sc.close();
	}
}