package com.kh.edu;

/*실습문제 3.
/ 기본값으로 그냥 시도하면 Sun Nov 01 22:14:44 GMT+09:00 2020 이렇게 출력되는 현상 발견
/ 문제에서의 출력 형식 : yyyy/MM/dd를 해결하기 위해 구글 검색 활용
/ 활용 메소드 출처 : https://bvc12.tistory.com/166
*/

import java.text.SimpleDateFormat;
// java에서 제공하는 SimpleDateFormat 클래스를 사용하기 위해 임포트
import java.util.Calendar;
import java.util.Date;
// java에서 제공하는 Date 클래스를 사용하기 위해 임포트

public class TestJavaApi {

	public static void main(String[] args) {
		
		Date day = new Date();
		
		SimpleDateFormat formatType = new SimpleDateFormat("yyyy/MM/dd");
//      SimpleDateFormat 을 사용하여 "yyyy/MM/dd로 출력 형태 변환
		
		System.out.println(formatType.format(day));
		
//		Calendar
		Calendar cal = Calendar.getInstance();
		System.out.println(
				cal.get(Calendar.YEAR) + "/" +
				(cal.get(Calendar.MONTH) + 1) + "/" +
				cal.get(Calendar.DATE));
		
//		SimpleDateFormat
		SimpleDateFormat u = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(u.format(day));
		
		
	}
}
