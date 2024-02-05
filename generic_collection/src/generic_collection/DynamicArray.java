package generic_collection;

public class DynamicArray {
	// 배열 카피
	public static void main(String[] args) {
		
		int[] scoreArray = new int[1];
		scoreArray[0] = 100;
		
		// scoreArray에 값 하나를 더 넣으려면?
		// 학생이 10명 -> 점수 10개 관리
		// int[] scoreArray = new int[10];
		// 전학생 1명 추가 -> 점수 11개 관리
		int[] scoreArray2 = new int[2];
		System.out.println("scoreArray2: " + scoreArray2 + ", " + scoreArray2.length);

		// array는 refereceType -> 메모리의 주소값을 전달한 것! 메모리 구조는 가만히 있고 주소만 대입된 것
		scoreArray2 = scoreArray;
		System.out.println("scoreArray: " + scoreArray + ", " + scoreArray.length);
		System.out.println("scoreArray2: " + scoreArray2 + ", " + scoreArray2.length);
		
		scoreArray2[0] = scoreArray[0];
		System.out.println("scoreArray2: " + scoreArray2 + ", " + scoreArray2.length);
		System.out.println("scoreArray[0]: " + scoreArray[0] + ", " + scoreArray2[0]);
		
		scoreArray2[0] = 99;
		System.out.println("scoreArray2[0] = 99: " + scoreArray[0] + ", " + scoreArray2[0]);

		System.out.println("============================");
		
		int[] scoreArrays = new int[10];
		scoreArrays[0] = 100;
		scoreArrays[1] = 90;
		scoreArrays[2] = 80;
		scoreArrays[3] = 70;
		scoreArrays[4] = 60;
		scoreArrays[5] = 50;
		scoreArrays[6] = 40;
		scoreArrays[7] = 30;
		scoreArrays[8] = 20;
		scoreArrays[9] = 10;
		
		int[] scoreArrays2 = new int[scoreArrays.length + 1];
//		for(int i = 0; i < scoreArrays.length; i++) {
//			scoreArrays2[i] = scoreArrays[i];
//		}
		System.arraycopy(scoreArrays, 0, scoreArrays2, 0, scoreArrays.length);
		
		for(int score : scoreArrays2) {
			System.out.print(score + " ");
		}
		
	
	}

}
