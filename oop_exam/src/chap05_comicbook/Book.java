package chap05_comicbook;

public class Book {
	
	// 멤버변수
	private String name;
	private int status; // 0: 대여 O, 1: 대여 X
	private int price;
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public String getStatus() {
		if(this.status == 0) {
			return "대여중";
		}
		return "대여 가능";
//		return this.status;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

}
