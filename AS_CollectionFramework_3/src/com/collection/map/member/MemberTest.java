package com.collection.map.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MemberTest {

	
	private Map<Integer, Member> map = new HashMap<>();
	
	
	public MemberTest() {
		map.put(1, new Member("honggd", "1234", "홍길동",  35, "01012341234"));
		map.put(2, new Member("sinsa", "1234", "신사임당",  50, "01012341234"));
		map.put(3, new Member("less", "1234", "이순신",  43, "01012341234"));
		map.put(4, new Member("yooon", "1234", "윤봉길",  37, "01012341234"));
		map.put(5, new Member("jangbg", "1234", "장보고",  29, "01012341234"));
		
	}
	
	
//	2. Map에 저장된 회원중 인자로 전달한 아이디가 존재하는 여부를 검사하는 메소드를 생성하세요.
	public boolean isUserExist(String userId) {
		
		Set<Map.Entry<Integer, Member>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<Integer, Member>> iter = entrySet.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<Integer, Member> a = iter.next();
			if((a.getValue().getUserId()).equals(userId))
						return true;
		}
		return false;
	}
	
//	다음 두 아이디를 테스트하세요.
//	- jangbg : true 리턴
//	- sejong : false 리턴
	public boolean test2() {
		
		String j = "jangbg";
		String s = "sejong";
		
		if(isUserExist(j)) {
			System.out.println(j + "가 있습니다.");
			return true;
		}
	
		if (isUserExist(s)) {
			System.out.println(j + "가 있습니다.");
			return true;				
		} return false;
	}
	
	
//	3. yooon 아이디 조회후 해당객체를 다음과 같이 수정하세요.
//	- 비밀번호 : 5678
//	- 이름 : 윤동주
//	- 나이 : 27
//	- 전화번호 : 01034563456

	public void test3() {
	
		map.replace(4, new Member("yooon", "5678", "윤동주",  27, "01034563456"));
		System.out.println(map);
		
	}
	
//	4. sinsa 아이디 회원을 삭제하세요.
	public void test4() {
		
		map.remove(2);
		System.out.println(map);
		
	}
}
