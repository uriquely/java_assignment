package com.api.member.model.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Member {
	
	private int memberNo;
	private String memberName;
	private int height;
	private int weight;
	private Calendar birth;
	
	public Member() {}

	public Member(int memberNo, String memberName, int height, int weight, Calendar birth) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.height = height;
		this.weight = weight;
		this.birth = birth;
	}
	
	public void information() {
		
		SimpleDateFormat birth = new SimpleDateFormat();
		birth.applyPattern("yyyy년 MM월 dd일");
		
		String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

		String[] sArr = data.split("[|]"); //sArr이라는 배열 객체 생성
		
		String[] yuna = sArr[0].split(","); //헐 
		String[] yang = sArr[1].split(",");
		String[] raeone = sArr[2].split(",");
		
		System.out.println(sArr[0]);
		System.out.println(sArr[1]);
		System.out.println(sArr[2]); //잘 들어감
		
	
		
	}
}
