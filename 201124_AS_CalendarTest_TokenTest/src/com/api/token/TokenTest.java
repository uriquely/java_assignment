package com.api.token;

import java.util.StringTokenizer;

public class TokenTest {
	
	public static void main(String[] args) {
		
		TokenTest tt = new TokenTest();
		tt.test1();
	}
	
	public void test1() {
		
		String data = "J a v a P r o g r a m";
		char[] cArr = new char[data.length()];
		StringTokenizer tokenizer = new StringTokenizer(data, " ");
		
		System.out.println("토큰 " + tokenizer.countTokens() + "개");
		
		int sum = 0;
		while(tokenizer.hasMoreTokens()) {
				String a = tokenizer.nextToken();
				cArr[sum++] = a.charAt(0);
		} 
		
		System.out.println("토큰 처리전 글자 출력 > " + data);
		System.out.println("전체 글자 개수 (공백 포함)> " + data.length() + "개");
		System.out.println("토큰 처리 후 글자 개수 출력 확인 > " + sum);
		System.out.print("Char[] 값 : ");
		
		for(int i = 0; i < sum; i++) {
			if(i == (sum-1))
			System.out.print(cArr[i] + ", ");
			else if(i < sum)
				System.out.print(cArr[i]);
		}
		
		System.out.println("\nString 대문자 변환 : " + new String(cArr).toUpperCase());
		
	}

}
