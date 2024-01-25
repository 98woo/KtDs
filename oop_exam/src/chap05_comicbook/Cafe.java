package chap05_comicbook;

public class Cafe {
	
	// 멤버변수
	private int balance;
	private Book book1;
	private Book book2;
	private Book book3;
	
	// 생성자
	public Cafe() {
		this.book1 = new Book();
		this.book1.setName("아이언맨");
		this.book1.setPrice(1000);
		this.book1.setStatus(1);
		
		this.book2 = new Book();
		this.book2.setName("블랙위도우");
		this.book2.setPrice(2000);
		this.book2.setStatus(1);
		
		this.book3 = new Book();
		this.book3.setName("스파이더맨");
		this.book3.setPrice(3000);
		this.book3.setStatus(1);
	}
	
	// getter
	public int getBalance() {
		return this.balance;
	}
	
	// 메서드
	// 만화책 목록 출력
	public void printList() {
		System.out.println("---------- 만화책 목록 출력 ----------");
		System.out.println("만화책: " + this.book1.getName() 
						+ " | 대여비: " + this.book1.getPrice() 
						+ " | 상태: " + this.book1.getStatus());
		System.out.println("만화책: " + this.book2.getName() 
						+ " | 대여비: " + this.book2.getPrice() 
						+ " | 상태: " + this.book2.getStatus());
		System.out.println("만화책: " + this.book3.getName() 
						+ " | 대여비: " + this.book3.getPrice() 
						+ " | 상태: " + this.book3.getStatus());
		System.out.println("----------------------------------");
	}

	// 만화책 대여
	public void lendBook(String name) {
		if((this.book1.getName()).equals(name)) {
			if(this.book1.getStatus().equals("대여중")) {
				System.out.println("대여중인 만화책은 대여할 수 없습니다.");
				return;
			}
			this.balance += this.book1.getPrice();
			this.book1.setStatus(0);
			System.out.println("만화책 " + this.book1.getName() + "을 대여하셨습니다.");
			System.out.println("만화카페 소지금: " + this.balance);
		} else if ((this.book2.getName()).equals(name)) {
			if(this.book2.getStatus().equals("대여중")) {
				System.out.println("대여중인 만화책은 대여할 수 없습니다.");
				return;
			}
			this.balance += this.book2.getPrice();
			this.book2.setStatus(0);
			System.out.println("만화책 " + this.book2.getName() + "을 대여하셨습니다.");
			System.out.println("만화카페 소지금: " + this.balance);

		} else if ((this.book3.getName()).equals(name)) {
			if(this.book3.getStatus().equals("대여중")) {
				System.out.println("대여중인 만화책은 대여할 수 없습니다.");
				return;
			}
			this.balance += this.book3.getPrice();
			this.book3.setStatus(0);
			System.out.println("만화책 " + this.book3.getName() + "을 대여하셨습니다.");
			System.out.println("만화카페 소지금: " + this.balance);
		} else {
			System.out.println("해당 만화책은 만화카페에 없습니다...");
		}
	}
	
	// 만화책 반납
	public void returnBook(String name) {
		if((this.book1.getName()).equals(name)) {
			this.book1.setStatus(1);
			System.out.println("만화책 " + this.book1.getName() + "을 반납하셨습니다.");
		} else if((this.book2.getName()).equals(name)) {
			this.book2.setStatus(1);
			System.out.println("만화책 " + this.book2.getName() + "을 반납하셨습니다.");
		} else {
			this.book3.setStatus(1);
			System.out.println("만화책 " + this.book3.getName() + "을 반납하셨습니다.");
		}
	}

}
