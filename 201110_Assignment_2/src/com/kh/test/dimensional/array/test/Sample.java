package com.kh.test.dimensional.array.test;

public class Sample {

	public static void main(String[] args) {
	
		Sample s = new Sample();
		s.exercise1();
	}

/**	
	[2차원 배열 실습문제]
			 - 클래스 생성 : com.kh.test.dimentional.array.test.Sample.java
			[문제 1]
			 - 메소드명 : public void exercise1()
			 - 구현내용 : 
			    1. 3행4열 2차원배열 선언 및 생성
			    2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
			    3. 아래의 내용처럼 처리함
			        0열    1열    2열    3열    
			    0행    값	값	값      0행 값들의 합계
			    1행    값 	값 	값 	1행 값들의 합계
			    2행    값 	값 	값 	2행 값들의 합계
*/
	
	/*
	 * 그림을 그린다..
	 * 
	 * 0 | 0,0 | 0,1 | 0,2 | 0,3 |
	 * 1 | 1,0 | 1,1 | 1,2 | 1,3 |
	 * 2 | 2,0 | 2,1 | 2,2 | 2,3 |
	 */
	
	public void exercise1() {
		
	
		int arr[][] = new int[4][4];
		

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length - 1; j++) {
				arr[i][j] = (int)(Math.random() * 100) +1;
				arr[i][arr[0].length - 1] += arr[i][j];
//				System.out.print(i + "/" + j + "\n");
			}
			
		}	
	
		
		for(int j = 0; j < arr.length; j++) {	
			int sum = 0;
			for(int i = 0; i < arr[0].length -1; i++) {
				sum += arr[i][j];
				arr[arr.length -1][j] = sum;
//				arr[arr.length -1][arr[0].length-1] += sum;
//				System.out.println("(" + i + "," + j + arr[i][j] + ")");
				
			}
			
		}	
			
		for(int i = 0; i < arr.length; i++) {	
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				if(j == arr.length - 2) {
					System.out.print("= ");
				}
					
				else if(j != arr.length -1) {
					System.out.print("+ ");		
				}
			}	
			System.out.println();
		
		}	
			
		

	}
}
