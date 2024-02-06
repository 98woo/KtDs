package contact_exam_list;
import java.util.*;

public class ContactMain {
	
	public static void main(String[] args) {
		
		System.out.println("저장할 연락처의 수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		ContactManager cm = new ContactManager(sc.nextInt());
		cm.contactStart();
		
		
	}
}
