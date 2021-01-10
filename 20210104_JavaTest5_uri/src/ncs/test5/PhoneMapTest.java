package ncs.test5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PhoneMapTest {

	public static void main(String[] args) {

		Map<String, Phone> map = new HashMap<String, Phone>();
		
//		Phone 객체를 3개 생성하여 맵에 모델을 key로 객체를 저장한다.

		Phone[] pArr = new Phone[3];
		
		pArr[0] = new Phone("galaxy S7", 563500, "삼성", 7);
		pArr[1] = new Phone("iphone 6s", 840000, "애플", 3);
		pArr[2] = new Phone("G5", 563500, "LG", 5);
		
		for(int i = 0; i < pArr.length; i++) {
			map.put(pArr[i].getModel(), pArr[i]);
		}
		
//		맵에 저장된 객체 정보를 연속 출력 한다.– Map.EntrySet<String, Phone> 사용할 것
		
		System.out.println("맵에 저장된 정보는 다음과 같습니다.");
		for(Map.Entry<String, Phone> entry : map.entrySet()) {
			System.out.println(entry.getKey() +  " : " + entry.getValue());
		}
		
//		맵에 저장된 객체 정보를 Properties 를 사용해 “phone.xml” 파일에 기록 저장한다.
		
		Properties ppt = new Properties();
		
		try {
			ppt.storeToXML(new FileOutputStream("phone.xml"), "phone");
			System.out.println("\n\nphone.xml 파일에 성공적으로 저장되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
		}
		
	}

}
