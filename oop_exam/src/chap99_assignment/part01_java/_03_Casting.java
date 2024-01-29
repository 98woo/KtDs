package chap99_assignment.part01_java;

public class _03_Casting {
    public static void main(String[] args) {

//        5. 사칙 연산 문제 4
//        정수형 변수 2개를 선언하고 값을 할당한다.
//        값이 할당된 정수형 변수 2개의 나누기 나머지를 구해 새로운 정수형 변수에 할당한다.
//        나누기 나머지가 할당된 변수의 값을 출력해본다.
        System.out.println("---- 캐스팅1 ----");

        short a = 94;
        short b = 3;

        int remainder = (int) a % b;
        System.out.println("remainder = " + remainder);

//        7. 캐스팅 문제 2
//        정수형 변수 2개를 선언하고 값을 할당한다.
//        값이 할당된 정수형 변수 2개의 나누기 결과를 구해 새로운 실수형 변수에 할당한다.
//        나누기 결과가 할당된 변수의 값을 출력해본다.
//        단, 소수점 이하의 자리수는 2자리만 저장해 출력한다.
//        예> 10.3333333 => 10.34
        System.out.println("---- 캐스팅2 ----");

        int i = 49;
        int j = 6;

        int division = (int) ((double) i / j * 100);
        System.out.println("division = " + division / 100.0);

    }
}
