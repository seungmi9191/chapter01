package practice01;

/**
 * 
 * @author woo seung mi 연습문제 1
 *
 */

public class Problem01 {

	public static void main(String[] args) {

		int i = 1;

		for (i = 1; i <= 100; i++) {

			// 5의 배수이면서 7의 배수인 수를 출력하라.
			if ((i % 5 == 0) && (i % 7 == 0)) {
				System.out.println(i);
			}

		}

	}

}
