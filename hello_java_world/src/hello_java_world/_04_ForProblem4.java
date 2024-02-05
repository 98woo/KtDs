package hello_java_world;

public class _04_ForProblem4 {
	public static void main(String[] args) {
		
		/*
		 * 별 찍기
		 * 
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 *  
		 */
		for(int i = 1; i < 6 ; i++) {
			for(int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
