package com.kh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Test2 t = new Test2();
		t.test();
		
	}
	
	
/**
  
   [문제 2]
	- 클래스 : com.kh.test.break_continue.Test2.java
	- 메소드명 : public void test()
    1~50 사이의 임의의 난수를 발생시키고, 
       정수 한 개를 입력 받아, 
       난수가 입력 받은 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력, 
       난수가 입력 받은 정수보다 크면 “입력하신 정수보다 큽니다.” 출력하세요.
       단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복되도록 하고, 
       정답인 경우 “정답입니다. 5회 만에 정답을 맞추셨습니다.”와 같이 
       몇 회 만에 정답을 맞추었는지 출력하도록 작성하세요.

*/
	
	public void test() {
		
		/*
		 * 1) 사용자한테 정수 하나를 입력받음 -> 스캐너
		 * 2) 정답 난수 하나를 랜덤으로 뽑아두어야 함 -> Math.round
		 * 3) 난수가 정답보다 크면 입력하신 정수보다 작습니다 -> if
		 * 4) 난수가 정답보다 작으면 입력하진 정수보다 큽니다 -> if else
		 * 5) 결과적으로 정답이면 몇 회만에 맞추었는지 출력
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*50)+1;
		//원래 형태가 double이기 때문에 (int)형변환 후 50을 곱하면 49까지 나온다(컴퓨터는 0부터..)그래서 바깥에 +1
//		System.out.println(answer); //출력 테스트
		
		System.out.println("숫자 맞추기! 1 ~ 50중 정답을 맞춰보세요!"); //첫 대문은 고정적으로 한 번
		
		int i = 1; //i를 몇 번만에 정답을 맞췄는지의 카운팅으로 사용
			
		while(true) {
			System.out.print("숫자 하나를 입력하세요 > ");
			int x = sc.nextInt();					//입력 역시 안에서 계속 반복되어야 한다.
		
				if(x > answer) {
					System.out.println("DOWN");
					i++;							//카운트를 세야 하니 안에다가..
				}
				else if(x < answer) {
					System.out.println("UP");
					i++;
				}
				else if(x == answer) {
					System.out.println("정답입니다! " + i + "번만에 정답을 맞추셨네요!");
					break;
				}
		}
	}
	

}
