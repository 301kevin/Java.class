import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Map
// => (key, value)로 데이터 저장
// => key 값의 중복을 허락하지 않음
// => 저장된 데이터의 순서가 없음

public class Exam1 {
	public static void main(String[] args) {
		// 제너릭 (Generic) : 클래스에 어떤 데이터를 사용할 지를 설정하는 것
		// <String, Integer> : 키 값으로 문자열, 저장데이터는 정수
		// => key : 정수, 문자열
		// => value : 모든 데이터
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 1) 저장
		map.put("aaa", 111);
		map.put("bbb", 222);
		map.put("ccc", 333);
		// 저장된 데이터 갯수 확인
		System.out.println("데이터 수 : " + map.size());
		System.out.println("-----------");

		// 2) 읽기
		// 전체 데이터 확인
		System.out.println(map);
		System.out.println("-----------");
		// 개별 데이터 확인
		System.out.println(map.get("aaa"));
		System.out.println(map.get("bbb"));
		System.out.println(map.get("ccc"));
		System.out.println("-----------");
		// 키값만 확인
		System.out.println(map.keySet());
		System.out.println("-----------");

		// 키값으로 모든 데이터 확인
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.printf("key : %s, value : %s\n", key, map.get(key));
		}
		System.out.println("-----------");

		// 3) 수정
		map.put("aaa", 555);
		map.replace("bbb", 777);
		System.out.println(map);
		System.out.println("-----------");

		// 4) 삭제
		map.remove("ccc");
		System.out.println(map);
		System.out.println("-----------");
		map.clear();
		System.out.println(map);
		System.out.println("-----------");

	}
}
