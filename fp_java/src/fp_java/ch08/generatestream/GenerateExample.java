package fp_java.ch08.generatestream;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 스트림 활용
 * 
 * 여러 개의 서버, 여러 개의 DB(보통은 한대, 많으면 3대)
 * 서버와 DB가 연결되어 있다.             
 */

public class GenerateExample {

	public static void main(String[] args) {
		
		// 배열로 스트림 만들기 1
		int[] numbers = {2, 3, 5, 7, 11, 13};
		Arrays.asList(numbers) // List<Integer>
			  .stream() // Stream<int[]>
			  .flatMapToInt(intArray -> Arrays.stream(intArray)) // IntStream
			  .boxed() // Stream<Integer>
//			  .forEach(number -> System.out.println(number))
			  .forEach(System.out::println);
		
		// 배열로 스트림 만들기 2
		Arrays.stream(numbers) // IntStream
			  .boxed() // Stream<Integer>
//			  .forEach(number -> System.out.println(number));
			  .forEach(System.out::println);
	
		String[] chars = {"A", "B", "C"};
		Arrays.asList(chars) //List<String>
			  .stream() // Stream<String>
			  .forEach(System.out::println);
		
		Arrays.stream(chars) // Stream<String>
			  .forEach(System.out::println);
		
		
		// 파일로 스트림 만들기 1
		// 파일을 읽어와서 스트림으로 변경
		File textFile = new File("C:\\Java Exam", "Java Exam");
		List<String> lines = null;
		
		try {
			lines = Files.readAllLines(textFile.toPath(), Charset.defaultCharset());
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		if (lines != null) {
			lines.stream() // Stream<List>
			     .forEach(System.out::println);
		}
		
		// 파일로 스트림 만들기 2
		// Auto closable Try ~ catch
		// streamLines 는 try 내에서만 사용할 수 있는 지역변수
		try (Stream<String> streamLines = Files.lines(textFile.toPath(), Charset.defaultCharset())) {
			streamLines.forEach(System.out::println);
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		try {
			Stream<String> streamLines = Files.lines(textFile.toPath(), Charset.defaultCharset());
			streamLines.forEach(System.out::println);
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		// 리스트로 스트림 만들기
		List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		numberList.stream() // Stream<Integer>
				  .map(number -> number * 2)
				  .forEach(System.out::println);
		
		// Map Date --> List Date 변경.
		// List 에 어떤 데이터를 넣을지 정해야 한다. (key, value)
		Map<String, String> menuMap = new HashMap<>();
		menuMap.put("빅맥1", "16000");
		menuMap.put("빅맥2", "26000");
		menuMap.put("빅맥3", "36000");
		menuMap.put("빅맥4", "46000");
		menuMap.put("빅맥5", "56000");
		menuMap.put("빅맥6", "66000");
		menuMap.put("빅맥7", "76000");
		
		// menuMap의 key 로 구성된 List 만들어보기
		// Map 을 Stream 으로 변경을 하려면 entrySet을 이용해야 한다.
		List<String> menuName = menuMap.entrySet() // Entry 라는 컬렉션이 값이 할당된다. Set<Entry<key, value>> --> Set<Entry<String, String>>
									   .stream() // Stream<Entry<key, value>> --> Stream<Entry<String, String>>
									   .map(entry -> entry.getKey()) // Stream<String>
									   .collect(Collectors.toList());	// toMap 도 있지만, 쓰기가 까다롭다
		menuName.forEach(System.out::println);
		
		
		
		
	}
}
