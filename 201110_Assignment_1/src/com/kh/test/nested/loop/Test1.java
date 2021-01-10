package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 t = new Test1();
//		t.test1();
		t.test2();
	
	}
	
/**
	 [문제2]
	클래스명: com.kh.test.nested.loop.Test2.java
	메소드명: public void test()
	    정수하나 입력받아, 그 수가 양수일때만 입력된 
	    수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
	    프로그램을 만들어보자.
	        출력예)
	      정수 입력 : 5
	    
	         *
	         **
	         ***
	         ****
	         *****
	          ****
	           ***
	            **
	             *
 */
	
	//i = 0 1 2 3 4
	//j = 0 1 2 3 4
	
	/*
	 *0000  *
	 **000  **
	 ***00  ***
	 ****0  ****
	 *****  *****
	 0****   **** 1 4 (공백 하나, 별 네개)
	 00***    *** 2 3	.
	 000**     ** 3 2	.
	 0000*      * 4 1	.
	 
	 
	 */
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("양수가 아닙니다.");
			return;
		} 
		
		// 4입력시, i : 0 1 2 3 4 5 6 (7행)
		// 5입력시, i : 0 1 2 3 4 5 6 7 8 (9행)
		for(int i = 0; i < num * 2 - 1; i++) {   //반복할 전체 행 수가 몇인지 먼저 파악하자
				
				
			if(i < num) {
				//i : 0 1 2 3 4
				for(int j = 0; j <= i; j++) {
					
					System.out.print("*");	
				}
			}	
			
				
			    //i : 5 6 7 8
			else { 
				// 5열 (사용자가 입력한 수) j : 0 1 2 3 4
				// 5: 1 4 -> j <= 0 공백 0
 				// 6: 2 3 -> j <= 1 공백 0 1
				// 7: 3 2 -> j <= 2 공백 0 1 2
				// 8: 4 1 -> j <= 3 공백 0 1 2 3
				for(int j = 0; j < num; j++) {
//					if(j > (i - num)) {
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
					if(j <= (i - num)) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				
				}	
			}
			System.out.println();
		}		
	}		

	
/**
		[문제1]
		클래스명: com.kh.test.nested.loop.Test1.java
		메소드명: public void test()
		    정수하나 입력받아, 그 수가 양수일때만 입력된 수를  행수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
		    
		    출력예)
		    정수 입력 : 5
		    *
		    **
		    ***
		    ****
		    *****
		    ==========================
		    정수 입력 : 0
		    양수가 아닙니다.
	  
*/
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int num = sc.nextInt();
		
			if(num <= 0) {
				System.out.println("양수가 아닙니다.");
			return;
			} 	
			
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				
			System.out.println();
			}
			
		System.out.println("==================");
		System.out.println("정수 입력값 : " + num);
		


	}

}
