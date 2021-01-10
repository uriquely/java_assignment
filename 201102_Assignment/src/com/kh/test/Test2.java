package com.kh.test;

public class Test2 {
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();
		t.test2();
		
	}
	
	/**
	 * 2. 자신의 신상정보를 저장할 변수를 만들고 정보를 변수에 대입, 출력하는 프로그램을 작성하세요.
		(System.out.printf 메소드 학습후 사용할것.)
		
    	- 이름, 나이, 성별,주소, 전화번호, 이메일      
		=======================================================================
		이름         나이    성별          전화번호                         이메일                          주소
		=======================================================================
		홍길동       22      남     01012341234    hgd@naver.com    경기도 광주시
		홍길순       20      여     010123412341   hgs@gmail.com    전라남도 광주시     
		                     
		작성한 변수를 재사용해 팀메이트의 정보를 다시 변수에 대입 출력하는 프로그램으로 수정하세요.
		
		%b boolean 형식으로 출력 

		%d 정수 형식으로 출력

		%o 8진수 정수의 형식으로 출력

		%x 또는 %X 16진수 정수의 형식으로 출력

		%f 소수점 형식으로 출력

		%c 문자형식으로 출력 

		%s 문자열 형식으로 출력

		%n 줄바꿈 기능

		%e 또는 %E 지수 표현식의 형식으로 출력

	 */
	
	public void test2() {
		
		String name = "홍길동";
		byte age = 22;
		char gender = '남';
		String hp = "01012341234"; //이게 왜 String으로 사용되는가? 예)주민등록번호
		String email = "hgd@naver.com";
		String address = "경기도 광주시";
	
		System.out.printf("=======================================================================%n"
				+ "이름\t나이\t성별\t전화번호\t\t이메일\t\t주소%n"
				+ "=======================================================================%n"
				+ "%s\t%d\t%c\t%s\t%s\t%s%n", name,age,gender,hp,email,address);
		
		name = "홍길순"; //선언이 아니고 값 대입이라서 오류가 나지 않는다.
		age = 20;
		gender = '여';
		hp = "01012341234";
		email = "hgs@gmail.com";
		address = "전라남도 광주시";
		
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s%n", name,age,gender,hp,email,address);

		
		
	}
	
	
	
}
