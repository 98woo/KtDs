package contact_exam_list;

import java.util.*;
import java.util.List;

public class ContactManager implements Contactable {
	
	Scanner scanner = new Scanner(System.in);
	private int contacts = 0;
	private Contact[] contactManager;
	
	@Override
	public int getContact() {
		return this.contacts;
	}
	
	@Override
	public void setContact(int contacts) {
		this.contacts = contacts;
	}
	
	@Override
	public Contact[] getContactManager() {
		return this.contactManager;
	}
	
	@Override
	public void setContactManaver(Contact[] contactManager) {
		this.contactManager = contactManager;
	}
	
	// 생성자
	public ContactManager(int sc) {
		this.contactManager = new Contact[sc];
		this.setContact(sc);
	}
	
	
	@Override
	public void contactStart() {
		
		for	(int i = 0; i < this.contacts; i++) {
			this.contactManager[i].setName(this.scanner.nextLine());
			this.contactManager[i].setPhoneNumber(this.scanner.nextLine());
			this.contactManager[i].setBirthDay(this.scanner.nextLine());
			this.contactManager[i].setRelation(this.scanner.nextLine());
			this.contactManager[i].setIsBlock(this.scanner.nextLine());
			this.contactManager[i].setAnniversary(this.scanner.nextLine());
			this.contactManager[i].setMemo(this.scanner.nextLine());
			
			System.out.println(this.contactManager[i]);
		}
		
		
		
	}
	
	
	
	@Override
	public void add(List<String> contactList) {
		
	}



	@Override
	public void addContact(List<String> contactList) {
		if (contactList.get(contactList.size() - 6).equals("")) {
			System.out.println("이름을 입력하세요."); // 재귀호출로 다시 입력 받도록 돌아가야 한다.
			
		}
		else {
			if (!contactList.get(1).matches("[^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$]")) {
				System.out.println("전화번호를 다시 입력하세요.");
				
			}
				
		}
	}

	@Override
	public void printAllContacts() {
		
	}

	@Override
	public void printOneContact(String name) {
		
		
	}

	@Override
	public void printAndUpdateDetailContact(int number, String name) {
		
		
	}

	@Override
	public void deleteOneContact(int number) {
		// TODO Auto-generated method stub
		
	}
	
}
