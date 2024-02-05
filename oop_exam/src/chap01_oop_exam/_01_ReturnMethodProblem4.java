package chap01_oop_exam;

public class _01_ReturnMethodProblem4 {
	
	public static int getSum(int korScore, int engScore
							, int mathScore, int progScore) {
		int sum = korScore + engScore + mathScore + progScore;
		return sum;
	}
	
	public static int getAverage(int sum, int num) {
		int average = sum / num;
		return average;
	}
	
	public static String getGrade(int average) {
		String grade;
		if (average >= 95) {
			grade = "A+";
		} else if (average >= 90) {
			grade = "A";
		} else if (average >= 85) {
			grade = "B+";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		return grade;
	}
	
	public static void main(String[] args) {
		int korScore = 90;
		int engScore = 88;
		int mathScore = 70;
		int progScore = 80;
		int count = 4;
		
		int sum = getSum(korScore, engScore, mathScore, progScore);
		int average = getAverage(sum, count);
		String grade = getGrade(average);
		
		System.out.println("총합: " + sum + ", 평균: " + average + ", 등급: " + grade );
	}

}
