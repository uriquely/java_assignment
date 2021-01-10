package ncs.test4;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Notice implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int no;
	private String title;
	private Date date;
	private String writer;
	private String content;

	public Notice() {
		super();
	}

	public Notice(int no, String title, Date date, String writer, String content) {
		super();
		this.no = no;
		this.title = title;
		this.date = date;
		this.writer = writer;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		
//		1 첫번째 공지글 2016-03-15 홍길동 홍길동이 올린 공지사항입니다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return no + " " + title + " " + sdf.format(date) + " " + writer + " " + content;
	}
}
