package com.oop.method.static_;

public class Run {
	
	public static void main(String[] args) {
		
		StaticMethod num = new StaticMethod();
		
		System.out.printf("원래 문장 : %s%n%n", num.getValue());
		
		//1
//		num.setValue(value.toUpperCase);
//		num.toUpper();
//		
//		//2
//		num.setChar(0, 'h');
		
		System.out.println(StaticMethod.valueLength()
							+ "\n"
							+ "--------------------\n");
		
		String a = ", 마지막 문제 끝!";
		System.out.println(StaticMethod.valueConcat(a)
							+ "\n"
							+ "--------------------\n");
	}	
}
