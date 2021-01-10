package com.oop.method.static_;

public class StaticMethod {
	
	//Field
	private static String value = "Hello World";
	
    //필드가 모두 static 일 때는 메소드도 전부 static 이어야 함
    //static method
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	
/**
	1. 반환값 없고 매개변수 없는 메소드
	value 필드 값을 모두 대문자로 바꾸는 static 메소드
	메소드명 : toUpper
*/
	public static void toUpper() {
		System.out.println("--------1번---------\n"
							+ value.toUpperCase()
							+ "\n"
					    	+ "--------------------\n");		
	}

		//String toUpperCase()
		//대상 문자열을 모두 대문자로 변환한다.
	
/**
	2. 반환값 없고 매개변수 있는 메소드
	인덱스와 문자를 전달받아
	value 필드에서 전달받은 인덱스 위치의 값을 전달받은 문자로 변경하는 static 메소드
	메소드명 : setChar
*/
	
	public static void setChar(int a, char b) {

		StringBuilder newChar = new StringBuilder(value);
		newChar.setCharAt(a, b);
		
		System.out.println("--------2번---------\n"
							+ newChar
							+ "\n"
							+ "--------------------\n");
	}
		
		//StringBuilder의 setCharAt()
		//문자열의 특정 위치에 있는 문자를 교체할 수 있다.
	
	
/**
	3. 반환값 있고 매개변수 없는 static 메소드
	value 필드에 기록된 글자갯수 리턴 처리
	메소드명 : valueLength
*/
	
	public static int valueLength() {
		System.out.println("--------3번---------");
		return value.length();
	}
	
		//.length()
		//글자의 갯수 리턴
/**
	4. 반환값 있고 매개변수 있는 static 메소드
	문자열값을 전달받아, value 필드값과 하나로 합쳐서 리턴 처리
	메소드명 : valueConcat
*/
	
	public static String valueConcat(String a) {
		System.out.println("--------4번---------");
		return value.concat(a);
		
		//.concat()
		//문자열을 하나로 합쳐서 리턴처리
	}
}
