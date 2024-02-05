package datetime_handler.newapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExam {

	public static void main(String[] args) {
		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		
		String strNowDate = dateFormatter.format(nowDate);
		
		System.out.println(nowDate);
		System.out.println(strNowDate);
		
		System.out.println();
		
		nowDate= LocalDate.of(2022, 1, 1);
		nowDate = nowDate.plusDays(10);
		nowDate = nowDate.plusMonths(2);
		nowDate = nowDate.plusYears(3);
		
		strNowDate = dateFormatter.format(nowDate);
		
		System.out.println(nowDate);
		System.out.println(strNowDate);
	}
}
