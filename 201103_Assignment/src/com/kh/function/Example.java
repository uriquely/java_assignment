package com.kh.function;

import java.util.Scanner;

public class Example {
	

	/*
	 * [문제 3]
 	- 메소드명 : public void opSample3(){}
 	- 구현 내용 : 
  	1. 정수 변수 선언
  	2. 키보드로 부터 정수 하나 입력받음
  	3. 입력받은 정수가 양수이면 "양수다." 출력
	       양수가 아니면 "양수가 아니다." 출력
	 */
	
	
	public void opSample3() {
		
		
		Scanner sc = new Scanner(System.in);
	
		int a;
		String s;
	
		System.out.print("정수 입력 > ");
		a = sc.nextInt();
		
		s = (a > 0) ? "양수다." : (a == 0) ? "0이다." : "양수가 아니다.";
		System.out.println(s);
		
		
		
	}
	
	/* - 메소드명 : public void opSample2(){}
 	- 구현 내용 : 
    	변수 선언하고, 키보드로 입력받은 값들을 변수에 기록하고
    	변수값을 화면에 출력 확인함
    
    	성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력처리함
    	=> 변수 선언후 입력받음 
    	학생이름 (문자열)
    	학년 (정수)
    	반 (정수)
    	번호 (정수)
    	성별(M/F) (문자)    //문자열로 입력받은 후, 문자하나 분리해야 함
    	성적 (실수)         //성적은 소수점 2자리까지 출력
 		- 출력 예
    	3학년 2반 24번 남학생 홍길동은 성적이 95.55이다.
	*/
	 
	public void opSample2() {
		 
		Scanner sc = new Scanner(System.in);
		
		String name;
		int grade;
		int group;
		int num;
		char gender;
		double record;
		
		System.out.print("학생이름 > ");
		name = sc.next();
		
		System.out.print("학년 > ");
		grade = sc.nextInt();
		
		System.out.print("반 > ");
		group = sc.nextInt();
		
		System.out.print("번호 > ");
		num = sc.nextInt();
		
		System.out.print("성별(Male/Female) > "); //*문자"열"로 입력받아서 뒷 글자를 잘라야 하는 문제점
//		gender = sc.next().substring(0); //*구글 서치로 찾은 것 substring(index);은 여기서~여기까지 가져오는 용도
//		String g = (gender == "M") ? "남학생" : "여학생"; 
		gender = sc.next().charAt(0);
		String strGender = gender=='M'?"남":"여";
		
	
		System.out.print("성적> ");
		record = sc.nextDouble();
		
		System.out.println("--------------------------------------");
		
		System.out.printf("%s학년 %d반 %d번 %s %s(은)는 성적이 %.2f이다.%n", grade, group, num, gender, name, record);
		
		System.out.println("--------------------------------------");
			 
		 
	 }
	 
	
	/*
	 * [문제 1]
 	- 메소드명 : public void opSample1(){}
 	- 구현 내용 : 
    	국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
    	각 점수를 키보드로 입력받고,
    	합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
    	세 과목의 점수와 평균을 가지고 "합격" 출력
    	합격의 조건 : 세 과목의 점수가 각각 40점이상이면서,
                  평균이 60점 이상이면 합격, 
                  아니면 "불합격" 출력

	 */
	
	public void opSample1() {
		
		Scanner sc = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		double average;
		String str;
		
		System.out.println("--------------------------");
		
		System.out.print("국어 점수를 입력하세요.> ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요.> ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요.> ");
		math = sc.nextInt();

		System.out.println("--------------------------");
		System.out.printf("당신의 총점은 %d점 입니다.%n", kor + eng + math);
		
		System.out.println("--------------------------");
		average = ((kor + eng + math) / 3.0);
		
		System.out.printf("당신의 평균 점수는 %.2f점 입니다.%n", average);
		System.out.println("--------------------------");
		
		str = (kor >= 40 && eng >= 40 && math >= 40 && average >= 60) ? "합격" : "불합격";
		
		System.out.println(str);
		//담긴 값을 다른 곳에 활용해야 할 때 다시 한 번 String으로 모아서 출력해주는 용도..
		System.out.println("--------------------------");
		
			
	}
	
	

}
