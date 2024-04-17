
public class Exam5 {
	public static void main(String[] args) {
		MySite bbs = new MySite() {

			@Override
			public void wirte() {
				System.out.println("새글쓰기");
			}

			@Override
			public void delete() {
				System.out.println("글 삭제");
			}
		};
		bbs.wirte();
		bbs.delete();
		System.out.println("----------------------------");

		MySite member = new MySite() {

			@Override
			public void wirte() {
				System.out.println("회원 가입");
			}

			@Override
			public void delete() {
				System.out.println("회원 삭제");
			}
		};
		member.wirte();
		member.delete();
	}
}
