package com.kh.test.condition;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Test2 t = new Test2();
		t.EvenAndOdd();

	}
	
	/**
	 * [문제 2]
		- 클래스 : com.kh.test.condition.Test2.java
		- 메소드명 : public void test()
		
   		1~10 사이의 정수 한개를 입력받아  홀수인지 짝수인지 확인하고, 
    	
    	홀수면 “홀수다.”, 
    	짝수면 “짝수다.”출력 하세요.
    	 
   		단, 1~10사이의 정수가 아닌 경우
   		“ 반드시 1~10사이의 정수를 입력해야 합니다.”를 출력하세요.

	 */
	
	public void EvenAndOdd() {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("1에서 10 사이의 정수 한 개를 입력하세요. > ");
		n = sc.nextInt();
		
		if(n < 1 || n > 10) {
			System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");	
		}
		else if(n % 2 == 0) {
			System.out.println("짝수다.");	
		}
		else {		
			System.out.println("홀수다.");	
		}
		
		
	}


}
