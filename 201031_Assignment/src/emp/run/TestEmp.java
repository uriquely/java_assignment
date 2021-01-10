package emp.run;

import emp.model.vo.Employee;

/*실습문제 1.
/ emp.model.vo.Employee; 경로에 있는 패키지의 클래스를 호출
*/

public class TestEmp {

	public static void main(String[] args) {
		
		Employee uri = new Employee();
//		Employee 클래스를 객체로 만들어주는 문법을 사용
		
		uri.printEmployee();
//		Employee 클래스를 객체로 만든 뒤 printEmployee의 메소드를 호출
		
	}
	
}
