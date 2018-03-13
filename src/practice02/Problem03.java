package practice02;

public class Problem03 {


	public static void main(String[] args) {

		char c[] = 
		{'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','1'};
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		} 
	
		System.out.println( );
		
		for(int j=0; j<c.length; j++) {
			c[4] = ',';
			c[7] = ',';
			c[9] = ',';
			System.out.print(c[j]);
		} 
	}		
}

