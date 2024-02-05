package chap05_comicbook;

public class Main {
	
	public static void main(String[] args) {

		Cafe cafe = new Cafe();
		
		cafe.printList();
		
		cafe.lendBook("아이언맨");
		cafe.printList();
		
		cafe.returnBook("아이언맨");
		cafe.printList();
		
		System.out.println("만화카페 소지금: " + cafe.getBalance());
	}

}
