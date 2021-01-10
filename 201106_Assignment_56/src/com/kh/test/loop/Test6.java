package com.kh.test.loop;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Test6 t = new Test6();
		t.test6();
	}
	
/**
		
			 [문제 6]
		- 클래스 : com.kh.test.loop.Test6.java
		- 메소드명 : public void test()
		    
		    분식집 주문 받는 프로그램을 만들어 보세요.
		    
		    1. 메뉴선택
		    2. 수량선택
		    3. 추가주문선택 
		    4. y면 1번부터 다시 시작. 단 데이터는 누적 
		    5. n면 주문결과서 출력 
		    메뉴
		    김밥류 ===================
		    1.원조김밥===========1500원
		    2.치즈김밥===========2000원
		    3.참치김밥===========2300원
		    라면류 ===================
		    4.그냥라면===========3000원
		    5.치즈라면===========3500원
		    6.짬뽕라면===========4000원
		    분식류 ===================
		    7.떡볶이=============2500원
		    8.순대==============2500원
		    9.오뎅==============1000원
		    기타 ====================
		    10.음료수===========1000원
		    결과
		    주문하신 정보는 다음과 같습니다.
		    ----------------------------
		    치즈라면: 3개 - 10500원
		    그냥라면: 3개 - 9000원
		    음료수: 3개 - 3000원
		    ----------------------------
		    합계 : 22500원
			  
*/

	public void test6() {
		
		
		Scanner sc = new Scanner(System.in);
		
		/*
		    1. 메뉴선택
		    2. 수량선택
		    3. 추가주문선택 
		    4. y면 1번부터 다시 시작. 단 데이터는 누적 
		    5. n면 주문결과서 출력  
		 */
		
		String allmenu = ("[메뉴]\n" 
				+ "김밥류 ===================\n"
			    + "1.원조김밥===========1500원\n"
			    + "2.치즈김밥===========2000원\n"
			    + "3.참치김밥===========2300원\n"
			    + "라면류 ===================\n"
			    + "4.그냥라면===========3000원\n"
			    + "5.치즈라면===========3500원\n"
			    + "6.짬뽕라면===========4000원\n"
			    + "분식류 ===================\n"
			    + "7.떡볶이=============2500원\n"
			    + "8.순대==============2500원\n"
			    + "9.오뎅==============1000원\n"
			    + "기타 ====================\n"
			    + "10.음료수===========1000원\n");
		
		int menu; //사용자가 선택할 메뉴 선언
		int ea;   //사용자가 고른 메뉴의 개수 선언
		char yn;  //추가 주문 여부 선언

		String all = ""; // 선택한 메뉴의 내역을 보여주기 위해, 글자니까 String
		
		int i = 0; // 최종 합계
		int sum = 0; // 각 메뉴별 합계
		
		String name = ""; // 글자를 출력해야 하므로 이 값을 초기화 해 둔다.
		
		while(true){
			
			System.out.println(allmenu);
			
			System.out.print("원하는 메뉴의 번호를 입력해주세요.> ");
			menu = sc.nextInt();
			
			System.out.print(menu + "번 메뉴의 수량은 몇 개입니까? > ");
			ea = sc.nextInt();
			
				switch(menu) {
				
					case 1 : 
						name = "원조김밥";
						sum += 1500*ea;
						break;
					case 2 : 
						name = "치즈김밥";
						sum += 2000*ea;
						break;
					case 3 : 
						name = "참치김밥";
						sum += 2300*ea;
						break;
					case 4 : 
						name = "그냥라면";
						sum += 3000*ea;
						break;
					case 5 : 
						name = "치즈라면";
						sum += 3500*ea;
						break;
					case 6 : 
						name = "짬뽕라면";
						sum += 4000*ea;
						break;
					case 7 : 
						name = "떡볶이";
						sum += 2500*ea;
						break;
					case 8 : 
						name = "순대";
						sum += 2500*ea;
						break;
					case 9 : 
						name = "오뎅";
						sum += 1000*ea;
						break;
					case 10 : 
						name = "음료수";
						sum += 1000*ea;
						break;
				}
			
			System.out.print("더 주문하시겠습니까?(y/n) > ");
			yn = sc.next().charAt(0);
			if(yn != 'n' && yn != 'y') {
				System.out.println("잘못된 문자입니다. y또는 n만 입력해주세요.\n"
									+ "프로그램을 다시 시작해야 합니다.\n\n");
				continue;			//컨티뉴를 사용해야 이전 값이 누적되지 않음. 다시 제어문의 처음으로 감
			}
			all += (name + ": " + ea + "개 - " + sum + "원\n"); //이렇게 안 하면 나중에 더해지지가 않음.. 마지막 줄 띄고
			i += sum;
			
			if(yn == 'n') {
				break;
			}

			} 
		



		System.out.println("주문하신 정보는 다음과 같습니다.");
		System.out.println("---------------------");
		System.out.println(all);
		System.out.println("---------------------");
		System.out.println("합계 :" + i);

	}
	
	
}
