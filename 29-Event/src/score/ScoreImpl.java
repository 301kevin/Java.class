package score;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {
	Scanner sc = new Scanner(System.in);
	// 전체 학생 데이터를 저장할 리스트
	List<ScoreVo> list = new ArrayList<ScoreVo>();
	ObjectInOut objectInOut = new ObjectInOut();
	String path = "Score.txt";
	String str;

	public ScoreImpl() {

	}

	// 입력
	@Override
	public String input(ScoreVo vo) {
		// 리스트에 학생 1명 데이터 저장
		list.add(vo);

		return "저장성공";
	}

	// 출력
	@Override
	public String print() {
		String result = printTitle() + "\n";
		for (int i = 0; i < list.size(); i++) {
			ScoreVo vo = list.get(i);
			result += vo.toString() + "\n";
		}

		return result;
	}

	// 제목 출력
	@Override
	public String printTitle() {
		String str = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t", "학번", "이름", "국어", "영어", "수학", "총점", "평균");

		return str;
	}

	// 검색 : 학번
	@Override
	public String searchHak(String hak) {
		String result = printTitle() + "\n";

		for (int i = 0; i < list.size(); i++) {
			ScoreVo vo = list.get(i);
			if (vo.getHak().equals(hak)) {
				result += vo.toString() + "\n";
			}
		}
		return result;
	}

	// 검색 : 이름
	@Override
	public String searchName(String name) {
		String result = printTitle() + "\n";
		for (int i = 0; i < list.size(); i++) {
			ScoreVo vo = list.get(i);
			if (vo.getName().equals(name)) {
				result += vo.toString() + "\n";
			}
		}
		return result;
	}

	// 정렬 : 총점, 내림차순
	@Override
	public void descSortTot() {
		// 정렬 기준 설정
		Comparator<ScoreVo> comparator = new Comparator<ScoreVo>() {

			@Override
			public int compare(ScoreVo vo1, ScoreVo vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1;
			}
		};
		// 정렬
		list.sort(comparator);
		// Collections.sort(list, comparator);
		// 출력
//		print();}
	}

	// 정렬 : 학번, 오름차순
	@Override
	public void ascSortHak() {
		// 정렬 기준 설정
		Comparator<ScoreVo> comparator = new Comparator<ScoreVo>() {

			@Override
			public int compare(ScoreVo vo1, ScoreVo vo2) {
				return vo1.getHak().compareTo(vo2.getHak());
			}
		};
		// 정렬
		list.sort(comparator);
		// Collections.sort(list, comparator);
		// 출력
//		print();
	}

	@Override
	public String write() {
		boolean result = objectInOut.write(path, list);

		if (result) {
			return "저장 성공";
		} else {
			return "저장 실패";
		}

	}

	@Override
	public String read() {
		list = objectInOut.read(path);
		if(list.size() > 0) {
			return "읽기성공";
		} else {
			return "읽어올 데이터가 없습니다";
		}
		
	}

}
