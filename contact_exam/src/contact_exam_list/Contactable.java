package contact_exam_list;

import java.util.List;

public interface Contactable {
	
	public int getContact();
	
	public void setContact(int contact);
	
	public Contact[] getContactManager();
	
	public void setContactManaver(Contact[] contactManager);
	
	public void contactStart();
	
	public void add(List<String> contactList);
	// 연락처 추가 메서드
	public void addContact(List<String> contactList);
	
	// 
	// 목록 출력 메서드(All)
	public void printAllContacts();
	// 간략한 정보 출력 메서드
	public void printOneContact(String name);
	// 편집 메서드
	public void printAndUpdateDetailContact(int number, String name);
	// 삭제 메서드
	public void deleteOneContact(int number);
	
}
