package chap02_class_exam;

public class CraneGameMachineMain {
	public static void main(String[] args) {
		
		CraneGameMachine game = new CraneGameMachine();
		
		game.dolls = 20;
		
		game.insertCoin();
		int result = game.doGame();
		
		System.out.println("뽑은 인형수: " + result);
		System.out.println("남은 인형수: " + game.dolls);
	}
}
