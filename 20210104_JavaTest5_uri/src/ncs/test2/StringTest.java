package ncs.test2;

public class StringTest {

	public static void main(String[] args) {

		String str = "A, b, c, D, a, B, C, d, f, F";

//		str에서 ,(콤마)로 데이터를 분리한다.
		String[] st = str.split(", ");
		
//		st 에서 char[] 로 바꾼다.
		char[] data = new char[st.length];
		
//		배열 할당 선언
//		for~each 문 사용한다.
		int i = 0;
		for(String c : st) { 
//			char[] 배열에 문자 데이터를 넣는다.
			data[i] = (c.toCharArray())[0];
			i++;
		}

		
//		char[] 에서 대문자만 골라서 출력 한다. continue 문 사용할 것
//		while loop 문 사용한다. 
		i = 0;
		while(i < data.length) {
			if((data[i] >= 'a') && (data[i] <= 'z')) {
				i++;
				continue;
			}
			System.out.println("data[" + i + "]" + " : " + data[i]);
			i++;
		} 
	}
}
