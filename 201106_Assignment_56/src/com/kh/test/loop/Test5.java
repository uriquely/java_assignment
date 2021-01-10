package com.kh.test.loop;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
	
		Test5 t = new Test5();
		t.test5();
	}
	
/**
	[문제 5]
	- 클래스 : com.kh.test.loop.Test5.java
	- 메소드명 : public void test()
	    3명의 회원정보를 입력 받아 저장하고 출력하는 
	    프로그램을 만드세요
	     입력 : 이름, 나이, 주소, 키, 몸무게, 연락처
	    
	    출력 예) 
	    ================ 저장회원===============
	    1 홍길동 19세 서울시 강남구 170cm 68kg 01012345678
	    2 임걱정 20세 경기도 수원시 180cm 75kg 01012345678
	                               
	    //기능추가1
	    //출력결과 마지막행에 다음 항목에 대한 평균을 구하시오.
	    ============================================
	    평균나이 00세 / 평균 키 : 00CM / 평균 몸무게 : 00kg
*/
	
	/*
	 *  1) 3명의 정보를 입력받는다. (이름,나이,주소,키,몸무게,연락처)
	 *  2) 서식에 맞게 출력한다.
	 *  3) 이 프로그램 안에는 추가 기능이 하나 존재한다. 마지막행에 평균나이, 키, 몸무게
	 *  4) 나이/3, 키/3, 몸무게/3으로
	 */
	public void test5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("개인 정보를 입력해주세요");
		
		String name;
		int age;
		String adress;
		double cm;		//오류 방지를 위해 더블로
		double kg;
		String hp;
		
		//사용자로부터 입력받을 값을 미리 선언
		
		String info = "";
		
		int age1 = 0; 
		int cm1 = 0;  // 키와 몸무게의 합계를 인트로 선언해서 뒷자리 소수점 절삭
		int kg1 = 0;
		
		//평균값에 출력할 값 선언
		
		int i = 1;
		while(i <= 3) {  // 1,2,3번을 세야 함
			
			// (이름,나이,주소,키,몸무게,연락처)
			
			System.out.print(i + "번 회원의 이름을 입력하세요.> ");
			name = sc.next();
			
			System.out.print(i + "번 회원의 나이를 입력하세요.> ");
			age = sc.nextInt();
			
			sc.nextLine(); //next 뒤 nextLine의 공란 만들기
			
			System.out.print(i + "번 회원의 주소를 입력하세요(시/구).> ");
			adress = sc.nextLine(); //  sc.next(); 했더니 오류...Line으로
			
			System.out.print(i + "번 회원의 키를 입력하세요.> ");
			cm = sc.nextDouble();
			
			System.out.print(i + "번 회원의 몸무게를 입력하세요.> ");
			kg = sc.nextDouble();
			
			System.out.print(i + "번 회원의 휴대폰번호를 입력하세요.> ");
			hp = sc.next();
			
			info += (i + " " + name + " " + age + " " + adress + " " + cm + " " + kg + " " + hp + "\n");
			
			i++;
			
			//회원번호를 계속 더해야 함 3까지
			
			age1 += age; // 돌 때마다 원래 값에 이후 값을 더한다.
			cm1 += cm;
			kg1 += kg;
			
		}
		
		
		
		System.out.println("================ 저장회원===============\n");
		System.out.println(info);
		System.out.println("======================================");
		System.out.printf("평균나이 : " + (age1/3) +  "세 / 평균 키 : " + (cm1/3) + "cm / 평균 몸무게 : " + (kg1/3) + "kg");
		
	}


}
