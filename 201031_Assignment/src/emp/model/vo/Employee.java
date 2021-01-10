package emp.model.vo;
// Package Explorer에서는 내부 패키지가 상위 패키지에 이름이 합쳐져서 표기된다.
// Navigator를 확인해 보면 model의 하위 패키지로 vo가 생성되어 있음을 알 수 있다.

public class Employee {
	
	public void printEmployee() {
//		새로운 출력메소드 생성
		
		System.out.println("-----------------\n"
				+"이름:유리\n"
				+"-----------------\n"
				+"나이:30세\n"
				+"-----------------\n"
				+"생년월일:1991/07/09\n"
				+"-----------------\n");
//		 개행문자인 \n을 활용하여 실행 시 보이는 화면이 깔끔해 보이도록 정렬한다.
//		 문자"열"출력
		
	}

}
