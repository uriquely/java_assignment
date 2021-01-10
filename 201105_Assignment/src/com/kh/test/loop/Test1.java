package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {


	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.test1();

	}
	
	
	/**
	 * 
	 * [문제 1]
		- 클래스 : com.kh.test.loop.Test1.java
		- 메소드명 : public void test()
    	1부터 사용자로부터 입력 받은 정수까지 존재하는 짝수의 합을 출력하세요. 
    	(for문 활용)

	 * 
	 * 
	 */
	
	public void test1() {
		
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("1부터 입력한 정수까지 존재하는 짝수의 합 구하기(정수 입력) > ");
		int x = sc.nextInt();
		int sum = 0;
		
		// 1 + 짝수 + 짝수 + x바로 앞 짝수 = ?
		
		for(int i = 1; i < x; i++ ) {
			
			//증감변수 int i = 1; int가 1이라고 선언
			
			//매 턴마다 검사하고 true면 실행되는 부분, i < x; 
			//i는 입력받은 값이 true일 때까지 반복구문을 실행하니까 x보다 커지면 종료됨	
			
			//증감식 i++ 턴이 지날 때마다 1씩 늘어남
			
			if(i % 2 == 0) {
			
				//1 % 2 != 0 버림
				//2 % 2 == 0 채용
				//3 % 2 != 0 버림
				//4 % 2 == 0 채용
				//...
				
			sum += i;
			
				// sum 값은 = sum + i라고 알려준다
			
				//1턴 i가 2로 나눴을때 나머지가 0이어야만 채용
				//1턴 짝수 i = 2, sum = 0 -> 0 + 2 = 2(sum) 
				//2턴 짝수 i = 4, sum 1턴에서 4됨 = 2 + 4 = 6(sum)
				//3턴 짝수 i = 6, sum 2턴에서 6됨 = 6 + 6 = 12(sum)
				//...
			
			}

		}
			
		System.out.println(sum); 
	}

}
