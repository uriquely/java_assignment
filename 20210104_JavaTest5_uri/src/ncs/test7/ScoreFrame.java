package ncs.test7;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lbTitle = new JLabel("점수를 입력하세요", JLabel.CENTER);
	private JLabel lbJavaScore = new JLabel("자바 : ");
	private JLabel lbSqlScore = new JLabel("SQL : ");
	private JLabel lbTotal = new JLabel("총점 : ");
	private JLabel lbAverage = new JLabel("평균 :");
	
	private JTextField javaScore = new JTextField();
	private JTextField sqlScore = new JTextField();
	private JTextField total = new JTextField();
	private JTextField average = new JTextField();
	
	private JButton calcBtn = new JButton("계산하기");
	
	public ScoreFrame(int x, int y, int width, int height) {
		
		//전체 JFrame영역
		setTitle("문제 7");
		setBounds(300, 300, 350, 300);
		setLayout(null);	
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//대제목 영역
		Font font = new Font("굴림", Font.PLAIN, 30);
		lbTitle.setFont(font);
		lbTitle.setBounds(0, 0, 335, 50);
		
		//좌측 상단 : 자바
		lbJavaScore.setBounds(10, 50, 40, 20);
		javaScore.setBounds(50, 50, 100, 20);
		
		//우측 상단 : SQL
		lbSqlScore.setBounds(180, 50, 40, 20);
		sqlScore.setBounds(220, 50, 100, 20);
		
		//센터 : calcBtn 버튼
		calcBtn.setBounds(120, 120, 100, 30);
		
		//좌측 하단 : 총점
		lbTotal.setBounds(10, 200, 40, 20);
		total.setBounds(50, 200, 100, 20);
		total.setEnabled(false);
		
		//우측 하단 : 평균
		lbAverage.setBounds(180, 200, 40, 20);
		average.setBounds(220, 200, 100, 20);
		average.setEnabled(false);
		
		//내부클래스 호출
		calcBtn.addActionListener(new ActionHandler());
		
		//JFrame에 추가
		add(lbTitle);
		add(lbJavaScore);
		add(javaScore);
		add(lbSqlScore);
		add(sqlScore);
		add(calcBtn);
		add(lbTotal);
		add(total);
		add(lbAverage);
		add(average);
	}
	
	//내부클래스
	class ActionHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				int a = Integer.parseInt(javaScore.getText());
				int b = Integer.parseInt(sqlScore.getText());
				total.setText(String.valueOf(a + b));
				average.setText(String.valueOf((a + b)/2));	

			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "숫자만 입력하셔야 합니다.");
			}

		}
	}
}
