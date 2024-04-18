import java.awt.Frame;

public class Exam1 {
	public static void main(String[] args) {
		Frame f = new Frame();
		// 윈도우 크기 설정  가로 세로
		f.setSize(300,200);
		// 제목 설정
		f.setTitle("Java Form 1");
		// 모니터에서 위치 설정 초기값 0 0 (왼쪽위 끝 부분이 기준, 움직이면 반대쪽 끝 부분이 기준으로 이동)
		f.setLocation(750,500);
		// 윈도우 창 보이기
		f.setVisible(true);
		
		
	}
}
