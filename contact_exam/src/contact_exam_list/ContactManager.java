package contact_exam_list;

import java.util.ArrayList;
import java.util.List;

public class ContactManager implements Contactable {
	
	List<String> contactListManager = new ArrayList<>();
	
	@Override
	public void setAddContact(List<String> contactList) {
		this.contactListManager.addAll(contactList);
	}
	
	@Override
	public void addContact(List<String> contactList) {
		if (contactList.get(contactList.size() - 6).equals("")) {
			System.out.println("이름을 입력하세요.");
		}
		else {
			this.contactListManager.set(contactListManager.addAll(contactList));
			System.out.println(contactListManager);
		}
	}
	
	
}
