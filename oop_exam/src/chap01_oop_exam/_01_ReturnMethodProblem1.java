package chap01_oop_exam;

public class _01_ReturnMethodProblem1 {
	
	public static int getTime(int minutes, int seconds) {
		int time = (minutes * 60) + seconds;
		return time;
	}
	
	public static void main(String[] args) {
		int minutes = 5;
		int seconds = 50;
		int time = getTime(minutes, seconds);
		
		System.out.println(time + "초");
	}

}
