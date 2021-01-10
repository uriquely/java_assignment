package com.oop.salary.model;

public class PayTable implements Output {
	
	public static final int MAX_SALARY = 10;
	private Salary[] salArr = new Salary[MAX_SALARY];
	
	private int x = 0;
	
	private String line = "-----------------------------------------------------------------------------------------";
	
	public void interSalaryData(Salary s) {
		salArr[x++] = s;
		
		//저장해야 할 index 체크
		//Salary객체가 생성될 때 이미 카운팅되므로 Salary.count - 1 저장
		
		if(Salary.count <= MAX_SALARY)
			salArr[Salary.count - 1] = s;
		else
			System.out.println("최대크기를 초과하여 더 이상 출력할 수 없습니다.");
		
	}
	
	@Override
	public void output() {
		
		System.out.println("\t\t\t\t*** 급여명세서 ***");
		System.out.println(line);
		System.out.println("이름\t기본급\t가족수\t가족수당\t시간외근무\t시간외수당\t세금\t인센티브(%)\t성과금\t실수령액");
		System.out.println(line);
		
		for(int i = 0; i < x; i++) {
			salArr[i].calc();
			salArr[i].output();
		}
		
//		for(Salary s : salArr) {
//			if(s! == null)
//				s.output();
//		}
		

		System.out.println(line);
		System.out.println("인원수 : " + Salary.getCount() + "명");
		System.out.println();
		System.out.println();
	}


}
