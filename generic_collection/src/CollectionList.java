

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	
	public static void main(String[] args) {
		
		List<Integer> scoreList = new ArrayList<>();
		
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(95);
		scoreList.add(85);

		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		System.out.println("===============================");
		
		int score1 = scoreList.get(0);
		System.out.println("score1 = " + score1);
		int score2 = scoreList.get(1);
		System.out.println("score2 = " + score2);
		int score3 = scoreList.get(2);
		System.out.println("score3 = " + score3);
//		int score9 = scoreList.get(10); // IndexOutOfBoundsException
//		System.out.println("score9 = " + score9);

		System.out.println("===============================");
		
		for(int i = 0; i < scoreList.size(); i++) {
			int score = scoreList.get(i);
			System.out.println("index" + i + ": " +score);
		}
		
		System.out.println("===============================");

		System.out.println("before = " + scoreList);
		System.out.println("before = " + scoreList.size());
		
		scoreList.remove(2);
		
		System.out.println("after = " + scoreList);
		System.out.println("after = " + scoreList.size());
		
		System.out.println("===============================");
		
		System.out.println("before = " + scoreList);
		System.out.println("before = " + scoreList.size());
		
		scoreList.clear();
		
		System.out.println("after = " + scoreList);
		System.out.println("after = " + scoreList.size());
		
		System.out.println("===============================");

		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(95);
		scoreList.add(85);
		
		System.out.println("before = " + scoreList.isEmpty());
		System.out.println("before = " + scoreList);
		System.out.println("before = " + scoreList.size());
		
		scoreList.clear();
		
		System.out.println("after = " + scoreList.isEmpty());
		System.out.println("after = " + scoreList);
		System.out.println("after = " + scoreList.size());
		
		System.out.println("===============================");
		
		List<Integer> test = new ArrayList<>();
//		List<Integer> test = null;
//		System.out.println(test.isEmpty()); // NullPointerException
		
		test.add(1);
		test.add(2);
		test.add(3);
		
		// nullPointException 체크
		if(test != null && !test.isEmpty()) {
			for(int i = 0; i < test.size(); i++) {
				int num = test.get(i);
				System.out.println("index" + i + ": " +num);
			}
		} 
		
		System.out.println("===============================");
		
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(95);
		scoreList.add(85);
		
		System.out.println("before = " + scoreList);
		System.out.println("before = " + scoreList.size());
		
		if(!scoreList.contains(70)) {
			scoreList.add(70);
		}
		
		System.out.println("after = " + scoreList);
		System.out.println("after = " + scoreList.size());
		
		System.out.println("===============================");

		List<Integer> scoreList2 = new ArrayList<>();
		scoreList2.addAll(scoreList);
		
		System.out.println("scoreList = " + System.identityHashCode(scoreList));
		System.out.println("scoreList = " + scoreList);
		System.out.println("scoreList = " + scoreList.size());
		
		System.out.println("scoreList2 = " + System.identityHashCode(scoreList2));
		System.out.println("scoreList2 = " + scoreList2);
		System.out.println("scoreList2 = " + scoreList2.size());

	}

}
