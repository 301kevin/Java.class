import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Exam4 {
	public static void main(String[] args) {
		String path = "test3.txt";
		// 읽은 내용이 저장될 byte 배열
		byte[] data = null;
		// byte 배열에 저장된 데이터를 문자열 변경해서 저장할 변수
		String result = null;

		// 파일 읽기
		InputStream in = null;
		try {
			in = new FileInputStream(path); // 파일 열기
			// 문자열 데이터를 저장할 byte 배열 생성
			// in.abailable() : 파일의 크기를 읽어오는 함수
			data = new byte[in.available()];
			// 읽어와서 저장하기
			in.read(data);
			System.out.println("[INFO] 파일 읽기 성공 >> " + path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 결로를 찾을 수 없습니다. >> " + path);
//			e.printStackTrace();
		} catch (IOException e) {
			data = null;	// 예외가 발생했기 때문에 초기화 시킴
			System.out.println("[ERROR] 파일 읽기 실패 >> " + path);
			// e.printStackTrace();
		} catch (Exception e) {
			data = null;	// 예외가 발생했기 때문에 초기화 시킴
			System.out.println("[ERROR] 알 수 없는 에러 >> " + path);
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// byte 배열에 저장된 데이터를 문자열 변경
		if (data != null) {
			try {
				result = new String(data, "utf-8");
				System.out.println(result);
			} catch (UnsupportedEncodingException e) {
				System.out.println("[ERROR] 인코딩 지정 에러");
//				e.printStackTrace();
			}
		}

	}
	
	
	
	
}











