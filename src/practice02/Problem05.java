package practice02;

public class Problem05 {
	public static void main(String[] args) {

		int i;
		int j;
		int k;
		int[] lottoNums = new int[6]; // 이 안에는 주소가 들어있어요.

		// 배열 안에 숫자 넣기
		for (i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = (int) (Math.random() * 45) + 1;

			for (j = 0; j < i; j++) {
				if (lottoNums[i] == lottoNums[j]) {
					i = i - 1;
					break;
				}
			}
		}
		// 배열 안의 숫자 읽어오기
		for (k = 0; k < lottoNums.length; k++) {
			System.out.println(lottoNums[k]);
		}

	}
}
