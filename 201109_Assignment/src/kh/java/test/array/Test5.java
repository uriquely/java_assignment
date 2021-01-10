package kh.java.test.array;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Test5 t = new Test5();
		t.test();

	}
	
/**
		  		[문제5]
		- 클래스 : kh.java.test.array.Test5.java
		- 메소드명 : public void test()
		    주민등록번호 성별자리 이후부터 *로 가리기.  
		    단, 원본 배열값은 변경 없이 배열 복사본으로 
		    변경하세요
		     
		    힌트) 복사방법
		       - for문이용 1:1대입
		       - System.arraycopy() 매소드 이용
		       - clone() 매소드 이용
 	
 */
	
	public void test() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요(숫자만) >  ");
		String rrn = sc.next();
		
		char[] arr1 = new char[13];
		char[] arr2 = arr1.clone();
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = rrn.charAt(i);
		}
		
		for(int i = 7; i < 13; i++) {
			arr2[i] = '*';
		}
		
		System.out.println("보안을 위해 뒷자리를 가립니다");		
		
		for(int i = 0; i < arr2.length; i++) {
			
			System.out.print(arr2[i]);
		}
		
	}

}
