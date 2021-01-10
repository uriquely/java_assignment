package kh.java.test.array;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		Test4 t = new Test4();
//		t.test1();
		t.test2();

	}
/**
	 - 메소드명 : public void test2()
	    위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
	    * java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
	    * 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.
		
*/
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요(숫자만). >  ");
		String hp = sc.next();
		hp = hp.substring(0, 3) + "1111" + hp.substring(7);
		System.out.println(hp);
		
		/*
		 * substring이란?
		 * 
		 * apple
		 * 01234
		 * 
		 * 여기서 원하는 문자열의 일부 값을 가져오는 메소드
		 * 
		 * 위에서 0,3이면 012번지를 가져오게 됨
		 * 뒤에 7인 이유는 엔드인덱스 없이 그냥 끝까지 가져오게 하는 역할
		 * 
		 */
		
	}
	
	
/**
	 	[문제4]
	- 클래스 : kh.java.test.array.Test4.java
	- 메소드명 : public void test1()
	    사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
	    단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
	     
	        힌트) 복사방법
	       - for문이용 1:1대입
	       - System.arraycopy() 매소드 이용
	       - clone() 매소드 이용

*/
	
	public void test1() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호를 입력하세요(숫자만). > ");
		String hp = sc.next();
		System.out.println("===================");
		
		char[] arr1 = new char[11];	
		char[] star = arr1.clone();
		
		
		for(int i = 0; i < arr1.length; i++) {
			star[i] = hp.charAt(i);
		}
		for(int i = 3; i < 7; i++) {
			star[i] = '*';
		}		
		for(int i = 0; i < star.length; i++) {
			System.out.print(star[i]);
			
		}
	}
}
