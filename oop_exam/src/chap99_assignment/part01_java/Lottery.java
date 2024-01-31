package chap99_assignment.part01_java;

import java.util.ArrayList;
import java.util.List;

public class Lottery {
	
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		int randomNumber =  (int) (Math.random() * 45 + 1);
		
		

		for(int i = 1; i < numbers.size(); i++) {
			if(numbers.size() <= 6) {
				return;
			}
			
			if(randomNumber != numbers.get(i)) {
				numbers.add(randomNumber);
			}
		}

		
		
	}

}
