package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.Calculator();
		
	}
	
	/**
	 * [문제 1]
	- 클래스 : com.kh.test.condition.Test1.java
	- 메소드명 : public void test()
    
    	정수 두개를 입력 받고, 
    	연산자(+,-,*,/)를 입력받은 다음 계산한 뒤
    	결과를 출력하는 계산기 프로그램을 만들어보세요.      
    	출력 예) 입력 5, 6, + -> 5+6=11
    	음수가 입력되거나 +,-,*,/ 이외의 문자가 입력되면 
    	“잘못 입력 하셨습니다.  프로그램을 종료합니다.” 라는 문구가 출력되게 하세요.
	 */
	
	public void Calculator() {
		
		Scanner sc = new Scanner(System.in);
		
		double n1;
		double n2;
		String n3;
		
		System.out.print("첫번째 정수를 입력하세요.> ");
		
		n1 = sc.nextDouble();
		
		//조기 return이라고 해서 그냥 바로 값 밑에 return;적으면 앞으로 돌아감
		
		if(n1 < 0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}	
		else if(n1 > 0) {
			System.out.print("두번째 정수를 입력하세요.> ");
		}
		
		n2 = sc.nextDouble();
	
		if(n2 < 0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}	
		else if(n2 > 0) {
			System.out.print("연산하고자 하는 기호를 입력하세요.(+,-,*,/) > ");
		}
		
		n3 = sc.next();
		
		// * 문제점 : == 연산자가 작동하지 않음		
		// * 구글 서치  : String 값의 "내용"비교는 .equals()를 사용한다.

		if(n3.equals("+")) {
			System.out.printf("연산 결과는 %.0f입니다.", (n1 + n2));
		}	
		else if(n3.equals("-")) {
			System.out.printf("연산 결과는 %.0f입니다.", (n1 - n2));
		}
		else if(n3.equals("*")) {
			System.out.printf("연산 결과는 %.0f입니다.", (n1 * n2));
		}
		else if(n3.equals("/")) {
			System.out.printf("연산 결과는 %.2f입니다. 소수점 이하 두 번째 자리까지 출력됩니다.", (n1 / n2));
		}
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		
		
		
	}

}
