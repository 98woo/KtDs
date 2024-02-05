package chap01_oop_exam;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Java 1.8 미만에서의 날짜 핸들링
 */
public class CalendarExam {

	public static void main(String[] args) {
		Calendar nowDateTime = Calendar.getInstance();
		System.out.println(nowDateTime);
		int year = nowDateTime.get(Calendar.YEAR);
		System.out.println(year);
		
		Calendar past = Calendar.getInstance();
		past.set(Calendar.YEAR, 1970);
		past.set(Calendar.MONTH, 0);
		past.set(Calendar.DAY_OF_MONTH, 1);
		past.set(Calendar.HOUR, 0);
		past.set(Calendar.MINUTE, 0);
		past.set(Calendar.SECOND, 0);
		
		// Calender는 월이 0부터 시작해서 -1을 해야 원하는 값을 얻을 수 있다.
		past.set(2022,  3-1, 1, 1, 50, 17);
		System.out.println(past);
		System.out.println(Calendar.DAY_OF_WEEK);
		
		Date now = Calendar.getInstance().getTime();
		System.out.println(now);
		
		// 날짜 포멧에 맞춰 변경
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = format.format(now);
		System.out.println(formatDate);
		
		Calendar nowCal = Calendar.getInstance();
		
		nowCal.set(2022,  01, 01);
		nowCal.add(Calendar.DAY_OF_WEEK, 10);
		nowCal.add(Calendar.DAY_OF_MONTH, -20);
	}
}
