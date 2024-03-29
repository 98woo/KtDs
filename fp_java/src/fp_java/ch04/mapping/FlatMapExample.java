package fp_java.ch04.mapping;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream.map 내부에서 새로운 Stream 을 반환할 때, 사용.
 */
public class FlatMapExample {

	public static void main(String[] args) {
		
		// word.txt 파일을 읽어서 List 로 변환하기
		File file = new File("C:\\Java Exam", "word.txt");
		
		List<String> wordList = null;
		try {
			wordList = Files.readAllLines(file.toPath(), Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println(wordList);
		
		// for 문으로 파일 내용 출력
//		for (String line : wordList) {
//			String[] letterArray = line.split("");
//			for (String letter : letterArray) {
//				System.out.println(letter);
//			}
//		}
		
		String joinedLetter = wordList.stream() // Stream<String> stream 인데 제네릭은 string 이다.
//				.peek(line -> System.out.println("Line " + line))
				.map(line -> line.split("")) // Stream<String[]>
//					.peek(letterArray -> {	
//						System.out.println("Array: " + letterArray);
//						for (String letter : letterArray) {
//							System.out.println("Letter: " + letter);
//						}
//					})
				// map 내부에서 stream 을 반환시키는 중일 때
				// flatMap 을 사용하게 되면
				// 반환된 Stream 이 원본 Stream 을 대체한다.
				.flatMap(letterArray -> Arrays.stream(letterArray)) // 배열을 stream 으로 변환한다.  map 을 쓰면 Stream<Stream<String>> 이렇게 돼서 flatMap으로 사용해야 원본 stream 이 반환된다.
//					.peek(letter -> System.out.println("Peek: " + letter))
				.distinct() // 중복 제거
//				.forEach(letter -> System.out.println("> " + letter));
				.collect(Collectors.joining()); // 한 글자씩 떨어진 글자들을 하나의 스트림으로 모아준다.
		System.out.println(joinedLetter);
		
				
		
	}
}
