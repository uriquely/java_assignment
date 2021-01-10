package ncs.test6;

public class Data {
	
	private int value;

	public Data() {
		super();
	}

	public int getValue() {
		
		/*
		value 값을 꺼냄
		단, isEmpty 가 false 가 될
		때까지 기다림, false 가 되면 value를 꺼내고, 
		isEmpty 를 true 로 바꾸고 대기상태의 스래드를 실행시킴
		값이 비었는데 꺼내려고 할 때 EmptyException 발생시킴.
		동기화 처리함
		*/
		
		return value;
	}

	public void setValue(int value) {

		/*
		value 값 기록 저장함
		단, isEmpty 가 true 가 될 때까지 대기, 
		true가 되면 기록 처리하고, 
		isEmpty 값 false로 바꾸고, 대기중인 스래드를 실행시킴
		동기화 처리함
		*/

		this.value = value;
	}
}
