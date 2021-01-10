package com.kh.test;


public class Test1 {

	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.test1();		
	}

	
	
	/**
	 * 1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.
	    - 정수형 100, 9999억, 
	    - 실수 486.520(float), 567.890123
	    - 문자 A
	    - 문자열 Hello world, 
	    - 논리 true
	     
	     단, 변수를 이용하여 출력하시오 .
	   -@com.kh.test.Test1
	   
	 *	    초기화
	 *	    변수의 선언과 값 대입을 동시에 하는 것.
	  
	 
	 */
	
	public void test1() {
		
		int int1 = 100;
		long long1 = 999_900_000_000L;
		float float1 = 486.520F;
		double double1 = 567.890123;
		char char1 = 'A';
		String string1 = "Hello world";
		boolean bool1 = int1 < long1;

		
		System.out.println("int1 : " + int1);
		System.out.println("long1 : " + long1);
		System.out.println("float1 : " + float1);
		System.out.println("double1 : " + double1);
		System.out.println("char1 : " + char1);
		System.out.println("string1 : " + string1);
		System.out.println("bool1 : " + bool1);
		
	}
}



