package score;
// 목차
// => 함수의 구성을 한눈에 파악하기 위해서
public interface Score {
	public String input(ScoreVo vo);		// 입력
	public String print();		// 출력
	public String printTitle();	// 제목 출력
	public String searchHak(String hak);	// 검색 : 학번
	public String searchName(String name);	// 검색 : 이름
	public void descSortTot();	// 정렬 : 총점, 내림차순
	public void ascSortHak();	// 정렬 : 학번, 오름차순
	public String write();		// 파일 저장
	public String read();			// 파일 읽기
}
