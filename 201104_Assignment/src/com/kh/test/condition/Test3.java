package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	
		Test3 t = new Test3();
		t.Bmi();

	}
	
	/**
	 * [문제 3]
		- 클래스 : com.kh.test.condition.Test3.java
		- 메소드명 : public void test()
		
    	키(cm)와 몸무게(kg)을 입력 받고, 
   		BMI(체질량지수)를 계산하여 계산된 값에 따라 
   		
   		저체중(18.5미만), 
   		정상체중(18.5이상 23미만), 
   		과체중(23이상 25미만), 
   		비만(25이상 30미만), 
   		고도비만(30이상)을 출력하세요. 
   		
   		BMI 계산식 = 체중(kg) / (신장(m) * 신장(m) ) 
   		예) BMI = 67 / (1.7 * 1.7)
	 */
	
	public void Bmi() {
		
		Scanner sc = new Scanner(System.in);
		
		// BMI = kg / ((cm / 100) * (cm / 100))
		
		
		double cm;
		double kg;
		
		System.out.print("당신의 키를 입력하세요.> ");
		cm = sc.nextDouble();
		System.out.print("당신의 몸무게를 입력하세요.> ");
		kg = sc.nextDouble();
		
		double m = cm / 100;
		double bmi = kg / (m * m);
//		System.out.println(bmi);

		if(bmi < 18.5) {
			System.out.println("저체중");
		}
		else if(bmi > 18.5 && bmi < 23) {
			System.out.println("정상체중");
		}
		else if(bmi > 23 && bmi < 25) {
			System.out.println("과체중");
		}
		else if(bmi > 25 && bmi < 30) {
			System.out.println("비만");
		}
		else {
			System.out.println("고도비만");
		}
		
		
		
	}

}
