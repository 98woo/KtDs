package chap02_class_exam;

public class Student {
	
	int java;
	int python;
	int cpp;
	int csharp;
	
	// method chaining
	public int getSumAllScores() {
		int sum = java + python + cpp + csharp;
		return sum;
	}
	
	public double getAverage() {
		int average = (int) (getSumAllScores() / 4.0 * 100);
		return average / 100.0;
	}
	
	public double getCourseCredit() {
		int credit = (int) ((getAverage() - 55) / 10 * 100);
		return credit / 100.0;
	}
	
	public String getABCDE() {
		double credit = getCourseCredit();
//		String grade;
		if(credit >= 4.1) {
//			grade = "A+";
			return "A+"; // 반환과 동시에 종료
		} else if(credit >= 3.6) {
			return "A";
		} else if(credit >= 3.1) {
			return "B+";
		} else if(credit >= 2.6) {
			return "B";
		} else if(credit >= 1.6) {
			return "C";
		} else if(credit >= 0.6) {
			return "D";
		} 
		// else {
		// 	return "F";
		// }
		// 모든 케이스에서 반환을 하기 때문에 return 필요 없음
		// else가 없다면 return 필요
		// 하지만, 실무코드는 else 사용 x
		return "F";
	}
}
