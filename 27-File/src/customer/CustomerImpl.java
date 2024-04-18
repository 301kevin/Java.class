package customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class CustomerImpl implements Customer {
	List<CustomerVo> list = new ArrayList<CustomerVo>();
	Scanner sc = new Scanner(System.in);
	ObjectInOut objectInOut = new ObjectInOut();
	String path = "Customer.txt";

	@Override
	public void input() {
		CustomerVo vo = new CustomerVo();
		System.out.print("고객 번호 : ");
		vo.setCusNum(sc.next());
		System.out.print("이 름 : ");
		vo.setName(sc.next());
		System.out.print("전화 번호 : ");
		vo.setTell(sc.next());
		System.out.println();

		list.add(vo);
	}

	@Override
	public void print() {
		printTitle();
		for (int i = 0; i < list.size(); i++) {
			CustomerVo vo = list.get(i);
			System.out.println(vo.toString());
		}
	}

	@Override
	public void printTitle() {
		String str = String.format("%s\t%s\t%s", "고객 번호", "이름", "전화 번호");
		System.out.println(str);
	}

	@Override
	public void searchCN() {
		System.out.print("검색할 고객 번호 : ");
		String cusNum = sc.next();

		printTitle();
		for (int i = 0; i < list.size(); i++) {
			CustomerVo vo = list.get(i);
			if (vo.getCusNum().equals(cusNum)) {
				System.out.println(vo.toString());
			}
		}

	}

	@Override
	public void searchN() {
		System.out.print("검색할 고객 이름 : ");
		String name = sc.next();

		printTitle();
		// 부분 이름으로 검색
		for (int i = 0; i < list.size(); i++) {
			CustomerVo vo = list.get(i);
			if (vo.getName().indexOf(name) >= 0) {
				System.out.println(vo.toString());
			}
		}

		// 전체 이름으로 검색
//		for (int i = 0; i < list.size(); i++) {
//			CustomerVo vo = list.get(i);
//			if (vo.getName().equals(name)) {
//				System.out.println(vo.toString());
//			}
//		}
	}

	@Override
	public void searcgT() {
		System.out.print("검색할 전화번호 : ");
		String tell = sc.next();

		printTitle();
//		for (int i = 0; i < list.size(); i++) {
//			CustomerVo vo = list.get(i);
//			if (vo.getTell().equals(tell)) {
//				System.out.println(vo.toString());
//			}
//		}
		for (int i = 0; i < list.size(); i++) {
			CustomerVo vo = list.get(i);
			if (vo.getTell().indexOf(tell) >= 0) {
				System.out.println(vo.toString());
			}
		}
	}

	@Override
	public void descSortN() {
		Comparator<CustomerVo> comparator = new Comparator<CustomerVo>() {

			@Override
			public int compare(CustomerVo vo1, CustomerVo vo2) {
				return vo2.getName().compareTo(vo1.getName());
			}

		};
		list.sort(comparator);
		print();
	}

	@Override
	public void ascSortCN() {
		Comparator<CustomerVo> comparator = new Comparator<CustomerVo>() {

			@Override
			public int compare(CustomerVo vo1, CustomerVo vo2) {
				return vo1.getCusNum().compareTo(vo2.getCusNum());
			}

		};
		list.sort(comparator);
		print();
	}

	@Override
	public void write() {
		boolean result = objectInOut.write(path, list);
		if (result) {
			System.out.println("저장 성공");
		} else {
			System.out.println("저장 실패");
			
		}
		System.out.println(list.size() + "개 저장됨");
	}

	@Override
	public void read() {
		List<CustomerVo> list_result = objectInOut.read(path);
		for (int i = 0; i < list_result.size(); i++) {
			System.out.println(list_result.get(i).toString());
		}
		System.out.println(list.size() + "개 출력됨");
	}

}
