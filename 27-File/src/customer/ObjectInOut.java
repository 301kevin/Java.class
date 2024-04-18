package customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ObjectInOut {
	public boolean write(String path, List<CustomerVo> list) { 	// write 메소드이고 path 파일의 경로 와 CustomerVo 객체를 가지는 리스트를 반환
		boolean result = false; 								// boolean을 리턴해야한다 result란 변수에 기본값이 될 false로 초기화
		FileOutputStream fos = null;							// 파일아웃풋스트림(파일 쓰기=출력 스트림)을 임포해트서 널로 초기화 시킨다
		ObjectOutputStream oos = null;							// oos는 객체를 직렬화해서 파일에 저장시켜야 하기 때문에 초기화

		try {													// 예외 처리
			fos = new FileOutputStream(path);					// 파일 출력 스트림을 생성한다
			oos = new ObjectOutputStream(fos);					// oos 생성한다
			oos.writeInt(list.size());							// 생성한 oos를 바이트로 직렬화한다  writeInt =  oos 클래스의 메소드
			for (int i = 0; i < list.size(); i++) {				// 객체 길이만큼 반복
				CustomerVo vo = list.get(i);					// vo필드를 객체에 삽입 
				oos.writeObject(vo);							// oos 객체 직렬화
			}
			result = true;										// 여기까지 진행이 완료 되었다면, 문제 없기 때문에 돌려줄 boolean 값을 true로 변경
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();								// 오류 표시
		} finally {
			try {
				if (oos != null)								// 스트림 종료
					oos.close();		
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;											// boolean 값이 저장된 변수 리턴
	}
	public List<CustomerVo> read(String path) {					// read 메소드이고 path 파일의 경로 와 CustomerVo 객체를 가지는 리스트를 반환
		List<CustomerVo> list = new ArrayList<CustomerVo>();	// list를 인덱스를 사용하여 customervo에 접근시킴
		FileInputStream fis = null;								// fis 입력을 도우는 스트림으로 작동하며 파일에서 데이터를 순차적으로 읽어오게 해줌
		ObjectInputStream ois = null;							// ois 객체를 역직렬화 해서 파일에서 데이터를 가져와 읽게 도움

		try {
			fis = new FileInputStream(path);					// fis에 파일 경로
			ois = new ObjectInputStream(fis);					// ois에 파일 역 직렬화
			int num = ois.readInt();							// write에서 writeInt로 바이트로 변환한것을 int로 변환해 읽어온다
			for (int i = 0; i < num; i++) {						// 읽어온 int만큼 반복
				CustomerVo vo = (CustomerVo) ois.readObject();	// vo 
				list.add(vo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없습니다. >> " + path);
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패 >> " + path);
			// e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("[ERROR] 알 수 없는 에러 >> " + path);
			// e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return list;
		
	}
}
