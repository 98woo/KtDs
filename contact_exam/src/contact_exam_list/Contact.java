package contact_exam_list;

import java.util.ArrayList;
import java.util.List;

// 데이터클래스
public class Contact {

	private String name;
	private List<String> phoneNumber;
	private String birthDay;
	private String relation;
	private String isBlock;
	private String anniversary;
	private String memo;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public List<String> getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}


	public String getRelation() {
		return relation;
	}


	public void setRelation(String relation) {
		this.relation = relation;
	}


	public String getIsBlock() {
		return isBlock;
	}


	public void setIsBlock(String isBlock) {
		this.isBlock = isBlock;
	}


	public String getAnniversary() {
		return anniversary;
	}


	public void setAnniversary(String anniversary) {
		this.anniversary = anniversary;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}

	public static void main(String[] args) {
		List<String> contactList = new ArrayList<>();
		List<String> contactDetailList = List.of("", "010", "24", "d", "0", "28", "q");
		if (contactDetailList.get(contactDetailList.size() - 6).equals("")) {
			System.out.println("이름을 입력하세요.");
			
		}
		

		
		
		

	}
}
