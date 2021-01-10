package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcDday {
	
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		CalcDday cd = new CalcDday();
		cd.test1();
				
	}

	private void test1() {
		
		System.out.print("연도를 입력하세요 : ");
		int yy = sc.nextInt();
		System.out.print("달을 입력하세요 : ");
		int MM = sc.nextInt();
		System.out.print("일을 입력하세요 : ");
		int dd = sc.nextInt();
		
		Calendar dday = new GregorianCalendar(yy, MM - 1, dd);
		Calendar now = new GregorianCalendar();
		
		long future = dday.getTimeInMillis(); //dday 밀리초 가져오는 것
		long past = now.getTimeInMillis(); //현재 밀리초 가져오는 것
		double diff = (future - past) / 1000.0 / 60 / 60 / 24; //밀리초, 초, 분, 시 단위로 나눠주기
		
		System.out.println(diff);
		
		//d-day전
		if(diff > 0)
		System.out.println("d - day가 " + ((int)diff + 1) + "일 남았습니다.");
		
		else if(diff < 0)
		System.out.println("d - day가 " + (((int)diff) * -1) + "일 지났습니다.");
		
		//d-day
		else if(diff > - 1)
			System.out.println("오늘이 D - DAY입니다.");
	}
}
