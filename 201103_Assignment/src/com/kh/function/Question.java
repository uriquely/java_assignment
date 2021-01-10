package com.kh.function;

public class Question {
	
	
	public static void main(String[] args) {
		
		Question qs = new Question();
		qs.test1();
		
	
	}
	
	public void test1() {
		
		int a = 1;
		int b = 3;
		int c = ++a;
		
		System.out.println(a < c && b == 3);
		
		System.out.printf("a = %d%nb = %d%nc = %d%n", a, b, c);


	}		
	
		
	
	
	
	
	
}
