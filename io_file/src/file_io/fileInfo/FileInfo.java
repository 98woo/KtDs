package file_io.fileInfo;

import java.io.File;
import java.util.Date;

public class FileInfo {
	
	public static void main(String[] args) {
		
//		File file = new File("C:\\Java Exam", "Java Exam.txt");
//		File file = new File("C:\\Java Exam", "Java Exam1.txt");
//		File file = new File("C:\\Java Exam");
//		File file = new File("C:\\");
		File file = new File("C:\\dev_program");
		
		// 파일 존재하면 true, 아니면 false
		boolean isFileExists = file.exists();
		System.out.println("file.exists() > " + isFileExists);

		// 읽어온 File 인스턴스가 파일이라면 true, 아니면 false
		boolean isFile = file.isFile();
		System.out.println("file.isFile() > " + isFile);
		
		// 일어온 File 인스턴스가 폴더(디렉토리)라면 true, 아니면 false
		boolean isDirectory = file.isDirectory();
		System.out.println("file.isDirectory() > " + isDirectory);
		
		// File 인스턴스가 가리키고 있는 폴더 또는 파일의 전체 경로
		String absolutePath = file.getAbsolutePath();
		System.out.println("file.getAbsolutePath() > " + absolutePath);
		
		// File 인스턴스가 가리키고 있는 것이 폴더라면 폴더 이름
		// 파일이라면 확장자를 포함한 파일의 이름
		String fileName = file.getName();
		System.out.println("file.getName() > " + fileName);
		
		// 파일 크기 확인(byte -> longType)
		// 1byte ==> 1
		// 1kb ==> 1024(windows 기준, windows가 아닐 경우 1000)
		// 1mb ==> 1024 * 1024
		// 1gb ==> 1024 * 1024 * 1024
		// 1tb ==> 1024 * 1024 * 1024 * 1024
		// 1pb ==> 1024 * 1024 * 1024 * 1024 * 1024
		// 폴더의 크기는 존재하지 않음(폴더 크기 = 폴더 내 존재하는 모든 파일의 크기)
		long fileSize = file.length();
		System.out.println("file.length() > " + fileSize + "byte");
		
		// 마지막으로 수정된 날짜와 시간
		// 컴퓨터의 시간 기준 ==> 1970-01-01 09:00:00 이때부터 흘러간 초 X 100
		// (KST이라서 00:00:00 아)
		long lastModifiedDate = file.lastModified();
		System.out.println("file.lastModified() > " + lastModifiedDate);
		
		// long 타입의 날짜와 시간을 문자로된 날짜와 시간으로 변환
		Date date = new Date(lastModifiedDate);
		System.out.println("date > " + date);
		
		// 현재 파일이 존재하는 부모(상위) 폴더의 경로(문자열)
		String parentPath = file.getParent();
		System.out.println("file.getParent() > " + parentPath);
		
		// 현재 파일이 존재하는 부모(상위) 폴더의 새로운 File 인스턴스
		File parentFile = file.getParentFile();
		System.out.println("file.getParentFile() > " + parentFile);
		System.out.println("parentFileAbsolutePath > " + parentFile.getAbsolutePath());
		
		// File 인스턴스가 폴더일 떄, 폴더 내부에 존재하는 모든 폴더와 파일 목록을 반환	
		File[] listFileArray = file.listFiles();
		// File을 대상으로 listFiles()하면 NullPointerException
		// C:\\ -> NullPointerException (windows 보안정책상 C:\\에 접근 X)
		for(File item : listFileArray) {
			System.out.println("file.listFiles() > " + item);
		}
		

	}

}
