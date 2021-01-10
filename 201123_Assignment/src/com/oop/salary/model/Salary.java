package com.oop.salary.model;

public class Salary extends Calculate implements Output {
	
	private String name; // 이름
	private long basePay; // 기본급
	private long familyPay; // 가족수당
	private long overtimePay; // 시간외수당
	private long incentivePay; // 성과금
	private long tex; //세금
	private long totalPay; //실수령액
	private int family; //가족수
	private int overtime; //초과근무시간 
	
	public static int count = 0; //총인원
	//이 퍼블릭이 현재 퍼블릭이면 굳이 게터나 세터는 필요하지 않음.

	public Salary() {}
	
	public Salary(String name, long basePay, int family, int overtime) {
		this.name = name;
		this.basePay = basePay;
		this.family = family;
		this.overtime = overtime;
		
		calc();
		count += 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBasePay() {
		return basePay;
	}

	public void setBasePay(long basePay) {
		this.basePay = basePay;
	}

	public long getFamilyPay() {
		return familyPay;
	}

	public void setFamilyPay(long familyPay) {
		this.familyPay = familyPay;
	}

	public long getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(long overtimePay) {
		this.overtimePay = overtimePay;
	}

	public long getIncentivePay() {
		return incentivePay;
	}

	public void setIncentivePay(long incentivePay) {
		this.incentivePay = incentivePay;
	}

	public long getTex() {
		return tex;
	}

	public void setTex(long tex) {
		this.tex = tex;
	}

	public long getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(long totalPay) {
		this.totalPay = totalPay;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Salary.count = count;
	}

	@Override
	void calc() {
		
		if(family < 3) {
			this.familyPay = family * 20000;
			
		}else {
			this.familyPay = family * 60000;
		}
		
		this.overtimePay = overtime * 5000;
		
		this.tex = (long) (basePay * 0.1);
		
		this.incentivePay = (long) (incentive * basePay);
		
		this.totalPay = basePay + familyPay + incentivePay + overtimePay - tex;
	}

	@Override
	public void output() {
		System.out.println(name + "\t" + basePay + "\t" + family + "\t" +
						   familyPay + "\t" + overtime + "\t" + overtimePay + 
						   "\t" + tex + "\t" + incentive + "\t\t" + incentivePay +
						   "\t" + totalPay);
	}
}
