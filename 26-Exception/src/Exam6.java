
public class Exam6 {
	AAA aa = new AAA();

	// 예외 전가된 함수를 사용할 경우에는
	// 1 예외 처리를 하거나
	public static void main(String[] args) {
		AAA aa = new AAA();
		
		try {
			aa.ex();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
//	다시 예외 전가를 시킴 (권장되지 않음)
//	public static void main(String[] args) throws Exception {
//		AAA aa = new AAA();
//		// 예외 전가된 함수를 사용할 경우에는
//		// 1 예외 처리를 하거나
//		// 2 다시 예외 전가를 시킴 (권장되지 않음)
//		aa.ex();
//
//		System.out.println("프로그램 종료");
//	}

}
