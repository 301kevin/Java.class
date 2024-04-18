import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class Exam2 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(300,200);
		f.setTitle("기본 화면");
		f.setLocation(750,350);
		// 버튼 1개 추가
		Button button = new Button("확인");
		button.setBackground(Color.YELLOW);
		// button.setBounds(int x, int y, int width, int height);
		button.setBounds(100, 100, 80, 30);
		// frame 에 추가
		f.setLayout(null);
		f.add(button);
		
		
		f.setVisible(true);
	}
}
