package practice02;

public class Problem01 {

	public static void main(String[] args) {
		
		int[] data = new int[] {1,3,5,8,9,11,15,19,18,20,30,33,31};
		int i;
		int count=0;
		int sum=0;
		
		for(i=0; i<data.length; i++) {	
			if(data[i]%3==0) {
			//System.out.println(data[i]);
			sum += data[i];
			count++;
			} 
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=> " + count);
		System.out.println("주어진 배열에서 3의 배수의 개수=> " + sum);
		
		
	}

}
