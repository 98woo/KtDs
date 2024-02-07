package fp_java.ch01.lambda.custominf;

public class CustomInfMain {
	
	public static void main(String[] args) {
		
		Airline airline = (num) -> num;
		int airlineResult = airline.getFee(1);
		System.out.println(airlineResult);
		
		int airlineResult2 = airline.getChildFee(1);
		System.out.println(airlineResult2);
		
		System.out.println();
		
		Calculatable calculatable = (number1, number2) -> System.out.println(number1 + number2);
		calculatable.printAddResult(20, 10);
		
		calculatable.printSubResult(20, 10);
		calculatable.printDivResult(20, 10);
		calculatable.printMulResult(20, 10);
		
	}
}
