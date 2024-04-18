package customer;

public interface Customer {
	public void input();		// 입력
	public void print();		// 출력
	public void printTitle();	// 타이틀
	public void searchCN();		// 고객 번호 검색
	public void searchN();		// 고객명 검색
	public void searcgT();		// 고객 번호 검색
	public void descSortN(); 	// 내림차순 이름
	public void ascSortCN();	// 올림 고객번호
	public void write();		// 파일 저장
	public void read();			// 파일 읽기
}
