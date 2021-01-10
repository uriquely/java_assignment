package com.api.calendar;

import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		CalendarTest ct = new CalendarTest();
		ct.test1();
	}
	
	public void test1() {
		Calendar cal = Calendar.getInstance();
		
		int yy = cal.get(Calendar.YEAR);
		int MM = cal.get(Calendar.MONTH);
		int dd = cal.get(Calendar.DATE);
//		int hh = cal.get(Calendar.HOUR);
//		int mm = cal.get(Calendar.MINUTE);
//		int ss = cal.get(Calendar.SECOND); 사용되지 않는 값 주석처리
		
		String[] weekDay = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };     

	      int num = cal.get(Calendar.DAY_OF_WEEK)-2; 
	      String today = weekDay[num]; 
		
		System.out.printf("%02d년 %02d월 %02d일 %s", yy - 9, MM -7, dd - 3, today);
	}
}
