package hello_java_world;

public class _04_IfExamProblem4 {
	public static void main(String[] args) {
		/*
		 * 2. 만약, 지금 시잔이 오후1시(13시)가 지났고
		 *    체크카드에 8000원 보다 많은 돈이 있다면
		 *    식당에서 점심식사를 할 수 있다.
		 *    그렇지 않다면 편의점에서 라면을 사먹을 수 있다.
		 */
		int hour = 13;
		int creditCard = 6000;
		
		if(hour >= 13 && creditCard >= 8000) {
			System.out.println("식당 이용 가능");
		} else {
			System.out.println("편의점 라면 ㅠㅠ");
		}
	}
}
