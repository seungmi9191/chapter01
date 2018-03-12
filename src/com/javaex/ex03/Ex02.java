package com.javaex.ex03;

public class Ex02 {

	public static void main(String[] args) {

		//int[] intArray = new int[5];
		/*intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 2;
		intArray[4] = 55;*/
		
		int[] intArray = new int[] {3,6,9};
		
		/*System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);*/
		
		for(int i=0; i<intArray.length; i++)  {
			System.out.println(intArray[i]);
		}
	}

}
