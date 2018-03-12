package com.javaex.ex03;

public class Ex01 {

	public static void main(String[] args) {
		
		int n01, n02, n03, n04, n05, n06;
		
       /*		
        n01 = (int)(Math.random()*45)+1; //1~45까지 랜덤
		n02 = (int)(Math.random()*45)+1; //1~45까지 랜덤
		n03 = (int)(Math.random()*45)+1; //1~45까지 랜덤
		n04 = (int)(Math.random()*45)+1; //1~45까지 랜덤
		n05 = (int)(Math.random()*45)+1; //1~45까지 랜덤
		n06 = (int)(Math.random()*45)+1; //1~45까지 랜덤
        */		
		
		int i;
		int [] lottoNums = new int[6]; //이 안에는 주소가 들어있어요.
		
		//배열 안에 숫자 넣기
		for(i=0; i<lottoNums.length; i++) {
			lottoNums[i] = (int)(Math.random()*45)+1;
		} 
		//배열 안의 숫자 읽어오기
		for(i=0; i<lottoNums.length; i++) {
			System.out.println(lottoNums[i]);
		}
		
		
		/*System.out.println(n01);
		System.out.println(n02);
		System.out.println(n03);
		System.out.println(n04);
		System.out.println(n05);
		System.out.println(n06);*/
		
		
	}

}
