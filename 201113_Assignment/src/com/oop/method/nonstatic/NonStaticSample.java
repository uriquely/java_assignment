package com.oop.method.nonstatic;

import java.util.Arrays;


public class NonStaticSample {
	
	public static void main(String[] args) {
		
		NonStaticSample nss = new NonStaticSample();
		
		//1번 값 출력
		nss.printLottoNumbers();
		
		//2번 값 출력
		int a = 11;
		char b = 'A';
		nss.outputChar(a, b);
		
		//3번 값 출력
		nss.alphabet();
		
		//4번 값 출력
		String a1 = "나는 과제를 하다 사망했다.";
		int b1 = 0;
		int c1 = 12;
		String result = nss.mySubstring(a1, b1, c1);
		System.out.print(result);
		System.out.println("\n-------------------------\n");
	}
	
/**
 		1. 반환값 없고 매개변수 없는 메소드

		실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
		메소드명 : printLottoNumbers
*/
	
	public void printLottoNumbers() {
		
		System.out.println("-----------1번-----------");
		
		int[] lotto = new int[6]; // 임의의 난수 6개 들어갈 배열 선언
		
		int idx = 0;
		
		
		for(;;) {
			
			int num = (int)(Math.random() * 45 +1);
			
			//중복제거
			for(int i = 0; i < idx; i++) {
				//중복된 수가 있다면, 해당 번지수의 난수를 다시 뽑기 위해
				//미리 1을 감산한다.
				if(lotto[i] == num) i--;
					
			
				//그냥 continue하면 바로 위 i++ 증감식으로 돌아가므로 라벨 달아서 앞으로 보낸다.
				//continue는 아래 실행을 안하고 다시 위로 돌아가는 기능
			}
			
			lotto[idx++] = num;
			
			if(idx == 6)
				break;
		}	
		System.out.println(Arrays.toString(lotto));
		System.out.println("-------------------------\n");
	}

/**
		2. 반환값 없고 매개변수 있는 메소드
		
		실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
		메소드명 : outputChar	
 */
	
	public void outputChar(int a, char b) {
		
		System.out.println("-----------2번-----------");

		for(int i = 1; i <= a; i++) {
			
			System.out.printf("%c", b);
			System.out.print(" ");
		}
		System.out.println("\n-------------------------\n");
	}
	
/**
		3. 반환값 있고 매개변수 없는 메소드
		실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		메소드명 : alphabet
 */
	
	public char alphabet() {
	
		System.out.println("-----------3번-----------");
		
		//0이면 대문자 65 ~ 90
		//1이면 소문자 97 ~ 122
		int a = (int)(Math.random()*26) + ((int)(Math.random()*2) == 0? 65 : 97);
		System.out.print((char)a);
		
		System.out.println("\n-------------------------\n");
		
		return (char)a;
	}
	
/**
		4. 반환값 있고 매개변수 있는 메소드
		실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
		추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
		메소드명 : mySubstring
*/
	
	public String mySubstring(String a1, int b1, int c1) {
		
		System.out.println("-----------4번-----------");
		//null여부 검사
		if(a1 == null)
			return null;
		//NullPointerException
		String result = a1.substring(b1, c1);
		return result;

	}
}
