package ncs.test4;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class NoticeTest {

	public static void main(String[] args) {
		
		NoticeTest nt = new NoticeTest();
		
		Object[] obArray = new Object[3];

		Scanner sc  = new Scanner(System.in);
		
		System.out.println("등록할 공지사항을 입력하시오. (3번 반복 입력 처리함)");
		
		int y = 2016;
		int m[] = {03, 04, 05};
		int d[] = {15, 23, 12};
		
		for(int i  = 0; i < obArray.length; i++) {
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("작성자 : ");
			String writer = sc.nextLine();
			
			System.out.print("내용 : ");
			String content = sc.nextLine();
			
			int no  = i + 1;
			
			Calendar cal = new GregorianCalendar(y, m[i] - 1, d[i]);
			Date date = new Date(cal.getTimeInMillis());
			
			obArray[i] = new Notice(no, title, date, writer, content);
		}

		nt.filesave(obArray);
		
//		리턴된 리스트 정보 출력 처리 – for each 문 사용
//		for(){ } //toString() 사용 출력 
		
		ArrayList<Notice> list = nt.fileRead();
		
		for(Notice n : list) {
			System.out.println(n.toString());
		}
		

	}
	
	private void filesave(Object[] obArray) {
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("notice.dat"));
			oos.writeObject(obArray[0]);
			oos.writeObject(obArray[1]);
			oos.writeObject(obArray[2]);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("리스트에 저장된 정보는 다음과 같습니다.");
		
	}

	public void fileSave() {
		
	}

	public ArrayList<Notice> fileRead() {
		
		ArrayList<Notice> list = new ArrayList<>();
		
		File f = new File("notice.dat");
		
		ObjectInputStream ois = null;
		
		try {

			ois = new ObjectInputStream(new FileInputStream(f));
			
			list.add((Notice)ois.readObject());
			list.add((Notice)ois.readObject());
			list.add((Notice)ois.readObject());
			
		} catch (EOFException e) {
			System.out.println("모든 정보를 읽었습니다.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				ois.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
		}
		return list;
	}

}
