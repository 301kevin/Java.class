package score;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScoreForm extends Frame implements ActionListener {
	Panel panelButton = new Panel();
	Panel panelCenter = new Panel();
	Panel panelName = new Panel();
	Panel panelSNum = new Panel();
	Panel panelTot = new Panel();
	Panel panelAvg = new Panel();
	Panel panelKor = new Panel();
	Panel panelEng = new Panel();
	Panel panelMat = new Panel();
	Panel panelNum = new Panel();
	Panel panelWrite = new Panel();

	// 아래
	Button buttoninput = new Button("입력");
	Button buttonoutput = new Button("출력");
	Button buttonNumsh = new Button("학번 검색");
	Button buttonNamesh = new Button("이름검색");
	Button buttonFileWrite = new Button("파일 저장");
	Button buttonFileread = new Button("파일 읽기");

	// 왼
	Label labelSN = new Label("학번");
	Label labelName = new Label("이름");
	Label labelKor = new Label("국어");
	Label labelEng = new Label("영어");
	Label labelMat = new Label("수학");
	Label labelTot = new Label("");
	Label labelAvg = new Label("");

	// 오
	TextField textFieldSNum = new TextField(15);
	TextField textFieldName = new TextField(15);
	TextField textFieldKor = new TextField(15);
	TextField textFieldEng = new TextField(15);
	TextField textFieldMat = new TextField(15);
	TextArea textArea = new TextArea();

	// ScoreImpl 객체 생성
	Score score = new ScoreImpl();
	// Dialog 객체 생성
	Dialog dialog = new Dialog(this);
	Button button_ok = new Button("OK");
	Button button_cancle = new Button("CANCEL");
	Label label_dialog = new Label("저장할까요?", Label.CENTER);
	Panel panel_dialog = new Panel();

	public ScoreForm() {
		setTitle("성적관리");
		setSize(600, 300);
		setLocation(900, 350);
		init();
		start();
		setResizable(false);
		setVisible(true);
	}

	private void init() {
		setLayout(new BorderLayout());
		add("South", panelButton);
		add("Center", panelCenter);
		
		panelButton.setLayout(new GridLayout(1, 6, 3, 0));
		panelButton.add(buttoninput);
		panelButton.add(buttonoutput);
		panelButton.add(buttonNumsh);
		panelButton.add(buttonNamesh);
		panelButton.add(buttonFileWrite);
		panelButton.add(buttonFileread);
		buttoninput.setBackground(new Color(255, 255, 0));
		buttonoutput.setBackground(Color.yellow);
		buttonNumsh.setBackground(Color.yellow);
		buttonNamesh.setBackground(Color.yellow);
		buttonFileWrite.setBackground(Color.yellow);
		buttonFileread.setBackground(Color.yellow);

		panelCenter.setLayout(new BorderLayout());
		panelCenter.add("West", panelNum);
		panelCenter.add("Center", textArea);
		textArea.setEditable(false);

		panelNum.setLayout(new GridLayout(6, 1));
		panelNum.add(panelSNum);
		panelNum.add(panelName);
		panelNum.add(panelKor);
		panelNum.add(panelEng);
		panelNum.add(panelMat);

		panelSNum.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelSNum.add(labelSN);
		panelSNum.add(textFieldSNum);

		panelName.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelName.add(labelName);
		panelName.add(textFieldName);

		panelKor.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelKor.add(labelKor);
		panelKor.add(textFieldKor);

		panelEng.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelEng.add(labelEng);
		panelEng.add(textFieldEng);

		panelMat.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelMat.add(labelMat);
		panelMat.add(textFieldMat);

		// Dialog 설정
		dialog.setTitle("파일 저장");
		dialog.setSize(200, 100);
		dialog.setLocation(250, 450);

		dialog.setLayout(new BorderLayout());
		dialog.add("Center", label_dialog);
		dialog.add("South", panel_dialog);

		panel_dialog.setLayout(new FlowLayout());
		panel_dialog.add(button_ok);
		panel_dialog.add(button_cancle);

		button_ok.setBackground(Color.YELLOW);
		button_cancle.setBackground(Color.YELLOW);
	}

	private void start() {

		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// 종료 직전에 데이터를 파일로 저장
				dialog.setVisible(true);

				// System.exit(0);
			}
		});

		// 버튼 설정
		buttoninput.addActionListener(this);
		buttonoutput.addActionListener(this);
		buttonNumsh.addActionListener(this);
		buttonNamesh.addActionListener(this);
		buttonFileWrite.addActionListener(this);
		buttonFileread.addActionListener(this);

		button_ok.addActionListener(this);
		button_cancle.addActionListener(this);

		// dialog x버튼 설정
		dialog.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dialog.dispose();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttoninput) {
			ScoreVo vo = new ScoreVo();
			String SNum = textFieldSNum.getText();
			vo.setHak(SNum); // 학번
			String Name = textFieldName.getText();
			vo.setName(Name); // 이름
			String Kor = textFieldKor.getText();
			vo.setKor(Integer.parseInt(Kor)); // 국어
			String Eng = textFieldEng.getText();
			vo.setEng(Integer.parseInt(Eng)); // 영어
			String Mat = textFieldMat.getText();
			vo.setMat(Integer.parseInt(Mat)); // 수학

			// 입력 검사
			if (SNum.equals("") || Name.equals("")) {
				textArea.setText("학번과 이름을 입력해주세요");
				return;
			}
			// 입력 검사
			if (Kor.equals("") || Eng.equals("") || Mat.equals("")) {
				textArea.setText("성적을 입력해주세요");
				return;
			}
			// textArea 초기화
			textArea.setText("");

			int tot = vo.getKor() + vo.getEng() + vo.getMat();
			double avg = (double) tot / 3;
			vo.setTot(tot);
			vo.setAvg(avg);

			String result = score.input(vo);
			textArea.setCaretPosition(result.length());
			textArea.setText(result);

			textFieldSNum.setText("");
			textFieldName.setText("");
			textFieldKor.setText("");
			textFieldEng.setText("");
			textFieldMat.setText("");

		} else if (e.getSource() == buttonoutput) {
			String result = score.print();
			textArea.setText(result);

		} else if (e.getSource() == buttonNumsh) {
			String hak = textFieldSNum.getText();
			// 입력 검사
			if (hak.equals("")) {
				textArea.setText("학번을 입력해주세요");
				return;
			}

			String result = score.searchHak(hak);
			textArea.setText(result);

			// 화면 초기화
			textFieldSNum.setText("");

		} else if (e.getSource() == buttonNamesh) {
			String name = textFieldName.getText();
			// 입력 검사
			if (name.equals("")) {
				textArea.setText("이름을 입력해주세요");
				return;
			}

			String result = score.searchHak(name);
			textArea.setText(result);

			// 화면 초기화
			textFieldName.setText("");

		} else if (e.getSource() == buttonFileWrite) {
			String result = score.write();
			textArea.setText(result);
		} else if (e.getSource() == buttonFileread) {
			String result = score.read();
			textArea.setText(result);
		} else if (e.getSource() == button_ok) {
			score.write();
			System.exit(0);
		} else if (e.getSource() == button_cancle) {
			System.exit(0);
		}

	}

}
