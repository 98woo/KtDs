package generic_collection;

public class ScoreListGenericMain {
	
	public static void main(String[] args) {
		
		// 제네릭(<>)을 명시해주지 않으면, 
		// method의 파라미터와 반환타입이 Object가 된다
//		ScoreListGeneric score = new ScoreListGeneric();
//		score.add(11);
//		score.add("java");
//		score.add(true);
//		score.add(new ScoreListGenericMain());
//		
//		String str = (String) score.get(3); // ClassCastException
		
		
		// 타입 별로 클래스를 새로 만들지 않아도 여러가지 타입으로 사용 가능
		ScoreListGeneric<Integer> scoreInteger = new ScoreListGeneric<>();
		scoreInteger.add(100);
		scoreInteger.add(95);
		scoreInteger.add(90);
		
		// Integer와 int는 같은 타입이므로, 그냥 int를 사용하자
		Integer num1 = scoreInteger.get(0);
		int num2 = scoreInteger.get(0);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		System.out.println(scoreInteger.get(0));
		System.out.println(scoreInteger.get(1));
		System.out.println(scoreInteger.get(2));
		
		System.out.println(scoreInteger.size());
		System.out.println(scoreInteger);
		
		System.out.println("==============================");
		
		ScoreListGeneric<Double> scoreDouble = new ScoreListGeneric<>();
		scoreDouble.add(100.0);
		scoreDouble.add(95.5);
		scoreDouble.add(90.1);
		
		System.out.println(scoreDouble.get(0));
		System.out.println(scoreDouble.get(1));
		System.out.println(scoreDouble.get(2));
		
		System.out.println(scoreDouble.size());
		System.out.println(scoreDouble);
		
		System.out.println("==============================");
		
		ScoreListGeneric<String> scoreString = new ScoreListGeneric<>();
		scoreString.add("백점");
		scoreString.add("구십오점");
		scoreString.add("구십점");
		
		System.out.println(scoreString.get(0));
		System.out.println(scoreString.get(1));
		System.out.println(scoreString.get(2));
	
		System.out.println(scoreString.size());
		System.out.println(scoreString);
	}

}
