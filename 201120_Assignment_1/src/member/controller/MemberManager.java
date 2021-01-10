package member.controller;

import member.model.vo.Member;

public class MemberManager {
	
	public static final int MEM = 40;
	private Member[] mArr = new Member[MEM];
		
	int mIdx = 0;
	
	public void insertMember(Member m) {
		this.mArr[mIdx++] = m;
	}
	
	String line = "---------------------------------------";
	
	public void printData() {
		
		System.out.println(line+ "\n이름\t등급\t포인트\t이자포인트\n" + line);
		
		for(int i = 0; i < mIdx; i++) {	
			System.out.printf(mArr[i].toString() + "\n");
		}
	
		System.out.println(line);
	}
}
