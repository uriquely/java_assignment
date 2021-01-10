package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
	
		Test4 t = new Test4();
		t.test4();

	}
	
	/** [문제 4]
			- 클래스 : com.kh.test.loop.Test4.java
			- 메소드명 : public void test()
				(문자열의 길이를 리턴하는 String의 메소드를 api에서 찾아 사용할 것)
				
			    문자열과 문자열에서 검색될 문자를 입력 받아 
			    문자열에 그 문자가 몇 개이었는지 개수를 확인하는 
			    프로그램을 작성하세요. 
			    또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후
			    프로그램을 종료하세요. 
			    
			    출력 예)
			    문자열 입력 : application
			    검색할 문자 입력 : p
			    'p'가 포함된 갯수 : 2 개
			    
			    
			    문자열 입력 : apple_test123
			    문자 입력 : ㄱ
			    영문자가 아닙니다.
	*/
	
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");         //확인할 문자열을 입력받는다.
		String input1 = sc.next();				//입력
		
		System.out.print("검색할 문자 입력 : ");		//검색할 문자를 입력받는다.
		char input2 = sc.next().charAt(0);		//문자열 char되었음
		
		int ea = 0;								//검색 문자가 입력받은 문자열 속에 자리하는 갯수를 추출 전이니 0으로 선언
		
		if((input2 >= 65 && input2 <= 90) || (input2 >= 97 && input2 <= 122)){ //char가 아스키코드 영역 안일때만 실행(영문자)하는 조건
			
			for(int i = 0; i < input1.length(); i++){ 
				
				// 1. 초기식 -> 증감변수 선언 i = 0;
				// 2. 조건식 -> i가 입력받은 문자열 수보다 작으면 반복구문 실행, 아니면 종료
				// 3. 반복구문 실행 후 i++ 인데..
				
				if(input2 == input1.charAt(i)) { 
					
				// 안에 조건을 하나 더 제시한다.
				// 사용자가 검색할 문자 input2를 입력했음.. 이 값이 input1(문자열)의 i값과 같소?
				// 같으면 실행하고, 아니면 말어
				
				// 1턴, i = 0; i가 0이니까 문자열 길이보다 짧다; 1됐음
				// 1턴 내부의 조건, 검색하고자 하는 글자(input2 값)와 
				// *여기서 중요 input1.charAt(i라고 써놨으니까, 숫자가 증가되는만큼 문자열 첫번째 ~ 끝자리가 달라짐)값이 같느냐?
				// 같으면! ea = ea + 1이 된다.
				// ... 계속 반복하면서 같은 값만 ea에 플러스되므로 -> 찾고자 하는 문자의 수 추출 가능
					
				ea += 1;
				}

			}
		}
		else {
			System.out.println("영문자가 아닙니다."); // 큰 if의 조건값에 부합하지 않으면 이 문장 출력하고 리턴
			return;
		}
	
		
		System.out.println(input2 + "가 포함된 갯수는 " + ea + "개 입니다.");
		}
		

		
	

}
