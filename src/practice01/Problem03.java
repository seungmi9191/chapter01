package practice01;

/**
 * 
 * @author woo seung mi 
 * 연습문제 3
 */

public class Problem03 {

	public static void main(String[] args) {

		int i=2; 
		int j=1;
		
		for(i=1; i<=9; i++) {
			//System.out.print(i);
			for(j=2; j<=9; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			} System.out.println();
		}
		
	}

}
