package ncs.test6;

/*
5. 실행 결과
putThread 작동시
> 값이 입력되었습니다.
> put value : 57

getThread 작동시
> get value : 57
> 값을 꺼냈습니다. value 가 비었습니다.

값이 없는데 getThread 작동시 EmptyException 메시지 출력
> 현재 입력된 값이 없습니다. 기다리십시오…
*/

public class MultiThreadTest {

	public static void main(String[] args) {
		
		Data data = new Data(); //공유데이터
		Thread putThread;
		Thread getThread;
		
//		data 를 공유하는 Provider 와 Customer 객체 생성 : Thread 객체 생성함
		
		// 쓰래드 구동
//		putThread.start();
//		getThread.start();

		
	}

}
