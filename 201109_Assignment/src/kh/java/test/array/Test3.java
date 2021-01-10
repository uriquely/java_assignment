package kh.java.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Test3 t = new Test3();
		t.test();

	}

/**
	  [문제3]
	- 클래스 : kh.java.test.array.Test3.java
	- 메소드명 : public void test()
	    문자열을 하나 입력 받아 배열에 넣고 문자를 하나 입력 받아 입력 받은 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을 작성하세요.
	    
	    예) 입력값 : helloworld
	    검색값 :ㅣ
	    출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
 */
	public void test() { 
		
		Scanner sc = new Scanner(System.in);
		
//		String[] arr = new String[1];		
//		int cnt = 0;						
//		
		//입력받음
		System.out.print("마음에 드는 문자열을 입력하세요. > ");
		String xStr = sc.nextLine();
		
		
				
//		
//			for(int i = 0; i < xStr.length(); i++) {
//				if(xStr.charAt(i) == xCh) {			
//					cnt++;
//				}
//			}
		
		//String 객체의 toCharArray 메소드
		char[] arr = xStr.toCharArray(); //배열의 모든 요소 확인
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0)
				System.out.print("[");
			
			System.out.print(arr[i]);
			
			if(i < arr.length -1)
				System.out.print(", ");
			else
				System.out.println("]");
		}
	
		System.out.println();
		
		System.out.print("찾을 문자를 입력하세요. > ");
		char xCh = sc.next().charAt(0);	
		
		int cnt = 0;
		
		for(int i = 0; i < xStr.length(); i++) {
			if(arr[i] == xCh) cnt++;
		}
		
		System.out.printf("입력값 : %s\n", xStr);
		System.out.printf("검색값 : %s\n", xCh);
		System.out.printf("찾으시는 문자 '%s'은(는) %d개 입니다.", xCh, cnt);
		
//	}
	}
	
}