// 논리연산자
// 수학의 교집합 : &&, 합집합 : ||, 여집합 : !을 명령어로 만든 것
// 왼쪽과 오른쪽의 데이터가 boolean 데이터를 사용함
/*	진리표
 * 	boolean	boolean	and			or			not
 * 	x		y		x && y		x || y		!x
 * 	true	true	true		true		false
 * 	true	false	false		true		false
 * 	false	true	false		true		true
 * 	false	false	false		false		true
 * 					둘다 true		둘중 true		결과 반대
 */
public class Exam7 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 7;
		
		System.out.println(num1 > num2 && num1 < num2);
		System.out.println(num1 > num2 || num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(!(num1 > num2));
		

	}

}
