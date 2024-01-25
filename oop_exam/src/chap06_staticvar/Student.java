package chap06_staticvar;

public class Student {
	
	private int java;
	private int python;
	private int cpp;
	private int csharp;
	
	public static double average;
	public static double credit;
	
	public Student() {
		this.java = 100;
		this.python = 97;
		this.cpp = 81;
		this.csharp = 99;
	}
	
	public int getSumAllScores() {
		int sum = this.java + this.python + this.cpp + this.csharp;
		return sum;
	}
	
	public double getAverage() {
		int average  = (int) (getSumAllScores() / 4.0 * 100);
		Student.average = average / 100.0;
		return Student.average;
	}
	
	public static double getCourseCredit(double average) {
		int credit = (int) ((Student.average - 55) / 10 * 100);
		Student.credit = credit / 100.0;
		return Student.credit;
	}
	
	public static String getABCDE(double courceCredit) {
		if(courceCredit >= 4.1) {
			return "A+";
		} else if(courceCredit >= 3.6) {
			return "A";
		} else if(courceCredit >= 3.1) {
			return "B+";
		} else if(courceCredit >= 2.6) {
			return "B";
		} else if(courceCredit >= 1.6) {
			return "C";
		} else if(courceCredit >= 0.6) {
			return "D";
		} 
		return "F";
	}
}
