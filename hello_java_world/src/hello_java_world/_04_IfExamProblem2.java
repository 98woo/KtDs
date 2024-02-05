package hello_java_world;

public class _04_IfExamProblem2 {
	public static void main(String[] args) {
		/*
		 * 여행 비용 : 100만원
		 * 부모님 : 40세, 36세 -> 비행요금 30만원
		 * 딸 : 11세 -> 비행요금 12만원
		 * 여행을 떠날 수 있다면 "여행가자!"
		 * 여행을 떠날 수 없다면 "다음에가자"
		 */
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daugther = 11;
		
		int adultOneWayFilghtFare = 300_000;
		int kidOneWayFilghtFare = 120_000;
		
		int cost = 0;
		
		// 방법1 : 성인 여부를 판단
//		if(father > 18) {
//			cost += adultOneWayFilghtFare;
//		} else {
//			cost += kidOneWayFilghtFare;
//		}
//		if(mother > 18) {
//			cost += adultOneWayFilghtFare;
//		} else {
//			cost += kidOneWayFilghtFare;
//		}
//		if(daugther > 18) {
//			cost += adultOneWayFilghtFare;
//		} else {
//			cost += kidOneWayFilghtFare;
//		}
		
		// 방법2 : 성인과 아동의 명수를 구함
//		int adult = 0;
//		int kid = 0;
//		if(father > 18) {
//			adult++;
//		} else {
//			kid++;
//		}
//		if(mother > 18) {
//			adult++;
//		} else {
//			kid++;
//		}
//		if(daugther > 18) {
//			adult++;
//		} else {
//			kid++;
//		}
//		
//		cost = (adultOneWayFilghtFare * adult) + (kidOneWayFilghtFare * kid);
		
		// 방법3 : 삼항연산자 
		// 성능 상의 문제
		// if : JVM에서 순차적으로 수행
		// 삼항연산자 : JVM 내에서 if로 변경시킨 후 코드 수행 -> 약간의 loss 발생
		// 단순한 코드들은 loss를 감수하고 사용할 수 있다
		cost += ( father >= 19 ? adultOneWayFilghtFare : kidOneWayFilghtFare );
		cost += ( mother >= 19 ? adultOneWayFilghtFare : kidOneWayFilghtFare );
		cost += ( daugther >= 19 ? adultOneWayFilghtFare : kidOneWayFilghtFare );
		
		// 방법4
//		int[] ages = {father, mother, daugther};
//		
//		for(int age : ages) {
//			if(age > 18) {
//				cost += adultOneWayFilghtFare;
//			} else {
//				cost += kidOneWayFilghtFare;
//			}
//		}
		
		if(money >= cost) {
			System.out.println("여행가자!");
		} else {
			System.out.println("다음에 가자ㅠㅠ");
		}
	}
}
