
public class Exam2 {
	// 2. 부모, 자식 클래스 기준 사용
	public static void main(String[] args) {
		// 객체 배열
		Unit[] units = new Unit[5];

		units[0] = new Army("육군1호");
		units[1] = new Army("육군2호");
		units[2] = new AirForce("공군1호");
		units[3] = new AirForce("공군2호");
		units[4] = new Navy("해군1호");

		for (int i = 0; i < units.length; i++) {
			units[i].attack();

			// instanceof(객체) : 레퍼런스에 저장된 주소가 해당 객체인지 검사하는 연산자
			if (units[i] instanceof Army) {
				Army army = (Army) units[i];
				army.tank();
			} else if (units[i] instanceof Navy) {
				Navy navy = (Navy) units[i];
				navy.nucleus();
			} else if (units[i] instanceof AirForce) {
				AirForce af = (AirForce) units[i];
				af.bombing();
			}
		}

//		Army army = new Army("육군");
//		Navy navy = new Navy("해군");
//		AirForce af = new AirForce("공군");
//		
//		army.attack();
//		army.tank();
//		System.out.println("--------------------");
//		
//		navy.attack();
//		navy.nucleus();
//		System.out.println("--------------------");
//		
//		af.attack();
//		af.bombing();
	}
}
