package chap01_oop_exam;

// enum 열거형 타입 생성. 
public enum CalcType {
	
	// enum 완벽한 형태의 싱글톤 패턴.
	// 흐름을 제어하는 상수들은 enum 으로 제어하는 것이 바람직하다.
	// 인스턴스 4개. 단 하나의 인스턴스만 생성됨(Singleton Instance) -> 메모리 주소가 같을 수밖에 없다.
	// Singleton Pattern
	ADD("+"), SUB("-"), MUL("*"), DIV("/");
	
	private String symbol;
	
	CalcType(String str) {
		this.symbol = str;
	}
	
	public String getSymbol() {
		return this.symbol;
	}
}
