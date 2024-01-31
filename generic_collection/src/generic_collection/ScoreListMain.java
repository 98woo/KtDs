package generic_collection;

public class ScoreListMain {
	
	public static void main(String[] args) {
		
		// intType만 사용 가능
		ScoreListInt scoreInt = new ScoreListInt();
		scoreInt.add(100);
		scoreInt.add(95);
		scoreInt.add(90);
		
		System.out.println(scoreInt.get(0));
		System.out.println(scoreInt.get(1));
		System.out.println(scoreInt.get(2));
		
		System.out.println(scoreInt.size());
		System.out.println(scoreInt);
		
		System.out.println("==============================");
		
		// doubleType만 사용 가능
		ScoreListDouble scoreDouble = new ScoreListDouble();
		scoreDouble.add(100.0);
		scoreDouble.add(95.5);
		scoreDouble.add(90.1);
		
		System.out.println(scoreDouble.get(0));
		System.out.println(scoreDouble.get(1));
		System.out.println(scoreDouble.get(2));
		
		System.out.println(scoreDouble.size());
		System.out.println(scoreDouble);
	}

}
