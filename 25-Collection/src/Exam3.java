import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
// Set
// => 데이터의 순서가 없다
// => 데이터의 중복을 허용하지 않는다.
// => 주로 리스트의 중복된 데이터를 제거하는 용도로 많이 사용함

public class Exam3 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

//		저장
		set.add("호랑이");
		set.add("사자");
		set.add("기린");
		set.add("코끼리");
		set.add("호랑이");

		// 데이터 개수확인
		System.out.println("데이터 개수 : " + set.size());
		System.out.println("---------------");

//		읽기
		// 전체 데이터 확인
		System.out.println(set);
		System.out.println("---------------");

		// 개별 데이터 확인할 수 없음

		// Iterator 를 통해서 전체 데이터 확인하기
		// => Set 객체에 저장된 데이터를 확인할 수 있다.
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------");

//		수정
		// => 데이터를 수정할 수 없음
		// => 데이터를 삭제하고 새로 추가한다

//		삭제
		// 1개 삭제
		set.remove("호랑이");
		System.out.println(set);
		System.out.println("-----------");
		// 전체 삭제
		set.clear();
		System.out.println(set);
		System.out.println("-----------");
		
		// 리스트에 저장된 중복데이터 삭제
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(10);
		System.out.println(list);
		System.out.println("-----------");
		
		Set<Integer> set1 = new HashSet<Integer>();
		for(int i = 0; i < list.size(); i++) {
			set1.add(list.get(i));
		}
		System.out.println(set1);
		System.out.println("-----------");
		// 세트에 저장된 데이터를 시트스에 저장
		list.clear();
		Iterator<Integer> iterator2 = set1.iterator();
		while(iterator.hasNext()) {
			list.add(iterator2.next());
		}
		System.out.println(list);
		System.out.println("-----------");
		
		
		
	}
}
