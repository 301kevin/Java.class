package prac1;

public class ScoreTable {
	private String name; // 이름
	private int sol; // 맞은 수
	private int score; // 점수
	private static int s = 20; // 배점

	public ScoreTable() {

	}

	public ScoreTable(String name, int sol) {
		this.name = name;
		this.sol = sol;
		calcScore();
	}

	public void printView() {
		System.out.printf("%s\t%3d점\n", name, score);
	}

	public void calcScore() {
		score = s * sol;
	}

}
