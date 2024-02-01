package file_io.writefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class WriteExam {
	
	public static void main(String[] args) {
		


		// 파일을 생성/쓰기할 경로와 파일 이름을 가진 인스턴스 생성
		File file = new File("C:\\java\\outputs", "java_output.txt");
		// 부모 경로의 폴더가 존재하는지 check
		if(! file.getParentFile().exists()) {
			// 존재하지 않는다면 폴더 생성
			// mkdirs(): 필요한 폴더 전부 생성
			// mkdir(): 부모 경로의 폴더만 생성 -> 이전 폴더가 없다면 생성x 
			file.getParentFile().mkdirs();
		}
		
		// 아래 코드가 없다면 같은 이름의 파일에 덮어쓰기 됨
		int index = 2;
		// 동일한 파일명이 존재한다면 넘버링하여 파일 생성
		while(file.exists()) {
//			file = new File("C:\\java\\outputs", 
//							"java_output (" + (index++) + ").txt");
			file = new File(file.getParent(), 
					"java_output (" + (index++) + ").txt");
		}
		
		// 기존의 파일에 이어서 쓰기 X
		// 파일을 이어서 쓸 수 있는 메서드 X
		// java 1.8 도입 --> 이어쓰기 O
		// java 1.8 미만
		// 기존의 파일 내용을 전부 읽어와서 새롭게 파일을 쓴다.
		
		// 파일 쓰기 시작
		// byte 단위로 파일 쓰기
		FileWriter fw = null;
		// 한 줄씩 쓸 수 있도록 buffering
		BufferedWriter bw = null;
		
		try {
			// 파일 인스턴스 인코딩(다국어) 처리
			fw = new FileWriter(file, Charset.forName("UTF-8"));
			// 파일 한 줄씩 버퍼링
			bw = new BufferedWriter(fw);
			// 파일 내용 쓰기
			bw.write("1. 파일을 씁니다.\n");
			bw.write("2. 파일을 씁니다.\n");
			bw.write("3. 파일을 씁니다.\n");
			// buffer 비우기
			bw.flush();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage()); // FileNotFoundException
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException ioe) {
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch(IOException ioe) {
				}
			}
		}
		System.out.println(file.getAbsolutePath());
	
		
	}
}
