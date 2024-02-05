package datetime_handler.newapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class LocalDateTimeExam {
	
	/**
	 * 전달 받은 날짜의 첫 번째 날짜부터 마지막 날짜까지를 출력 (요일 포함)
	 * @param date 기준이 되는 날짜
	 */
	public static void printCalendar(LocalDate date) {
	
		// date 인스턴스를 YearMonth로 변경.
		YearMonth yearMonth = YearMonth.from(date);
		
		// 첫 번째 날짜를 구한다.
		LocalDate firstDay = yearMonth.atDay(1);
		
		// date 인스턴스의 월의 총 길이(며칠)를 구한다.
		int days = date.lengthOfMonth();
		
		// 반복하며 날짜와 요일을 출력한다.
		System.out.println(firstDay);
		System.out.println(firstDay.getDayOfWeek().name());
		for (int i = 0; i < days - 1; i++) {
			firstDay = firstDay.plusDays(1);
			System.out.println(firstDay);
			System.out.println(firstDay.getDayOfWeek().name());
		}
		System.out.println("=============================================");
	}
	
	/**
	 * 금일 제외하고 가장 가까운 다음 영업일을 구한다.
	 * @param localDate 오늘
	 * @return
	 */
	public static Map<String, Object> getClosesWorkingDay(LocalDate localDate) {
		
		// 1. localDate에 하루를 더해본다. 
		localDate =localDate.plusDays(1);
		
		
		// 2.오늘의 요일을 구한다.
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		
		int dayCount = 1;
		
		// 3. 하루를 더한 날짜가 휴일인지 검사한다.
		while (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
			// 4. 만약 휴일이라면 하루를 또 더한다.
			localDate =localDate.plusDays(1);
			dayOfWeek = localDate.getDayOfWeek(); // 재할당된 날짜를 검사
			dayCount++;
		}
		
		// 여러 개의 값을 반환. Map은 이럴 때 많이 쓰인다.
		Map<String, Object> result = new HashMap<>();
		result.put("workingDay", localDate);
		result.put("dayCount", dayCount);
		
		// 5. 만약 휴일이 아니라면 더한 결과를 반환한다.
		return result;
	}
	
	public static void main(String[] args) {
		
		Map<String, Object> closesWorkingDay = getClosesWorkingDay(LocalDate.now());
		System.out.println(closesWorkingDay.get("workingDay"));
		System.out.println(closesWorkingDay.get("dayCount"));
		
		closesWorkingDay = getClosesWorkingDay(LocalDate.of(2024, 2, 9)); // 금요일
		System.out.println(closesWorkingDay.get("workingDay")); // 2월 12일 (월요일)
		System.out.println(closesWorkingDay.get("dayCount")); 
		System.out.println("============================");
		
		printCalendar(LocalDate.now());
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		String strNowDateTime = dateTimeFormatter.format(nowDateTime);
		
		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);
		
		System.out.println();
		
		nowDateTime = LocalDateTime.of(2022, 2, 1, 11, 39, 11);
		nowDateTime = nowDateTime.plusDays(10);
		nowDateTime = nowDateTime.plusMonths(2);
		nowDateTime = nowDateTime.plusYears(3);
		nowDateTime = nowDateTime.plusHours(10);
		nowDateTime = nowDateTime.plusMinutes(5);
		nowDateTime = nowDateTime.plusSeconds(55);
		
		strNowDateTime = dateTimeFormatter.format(nowDateTime);
		
		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);
		
		nowDateTime = nowDateTime.minusDays(11);
		nowDateTime = nowDateTime.minusYears(27);
		
		strNowDateTime = dateTimeFormatter.format(nowDateTime);
		System.out.println(strNowDateTime);
		
		System.out.println();
		
		LocalDate now = LocalDate.now();
//		LocalDate now = LocalDate.of(2022, 1, 15);
		
		// 현재 요일
		System.out.println(now.getDayOfWeek().name());	// LocalDate, LocalDateTime 사용
		
		YearMonth yearMonth = YearMonth.from(now);
		
		// 이번 달의 첫 번째 날 구하기
		LocalDate firstDay = yearMonth.atDay(1); // LocalDate, LocalDateTime 사용
		System.out.println(firstDay);
		System.out.println(firstDay.getDayOfWeek().name());
		
		// 이번 달의 마지막 날 구하기
		LocalDate lastDay = yearMonth.atEndOfMonth(); // LocalDatem, LocalDateTime 사용
		System.out.println(lastDay);
		System.out.println(lastDay.getDayOfWeek().name());
		
		// 이번 달은 총 며칠인지 구하기
		int lengthOfDays = now.lengthOfMonth(); // LocalDate 전용
		System.out.println(lengthOfDays);
		
		// 이번 해는 총 며칠인지 구하기
		int lengthOfYears = now.lengthOfYear(); // LocalDate 전용
		System.out.println(lengthOfYears);
		
		
		// 날짜와 날짜 사이의 차이 구하기 Period 메서드
		LocalDate startDate = LocalDate.of(2022, 1, 1);
		LocalDate endDate = LocalDate.of(2023,  5,  20);
		Period between = Period.between(startDate, endDate);
		System.out.println(between.getYears() + ", " + between.getMonths() + ", " + between.getDays());
	}
}
