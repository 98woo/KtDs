package chap99_assignment.part01_java;

public class _02_Operator {
    public static void main(String[] args) {


//        2. 사칙 연산 문제 1
//        정수형 변수 4개를 선언하고 값을 할당한다.
//        값이 할당된 정수형 변수 4개의 합을 구해 새로운 정수형 변수에 할당한다.
//        합이 할당된 변수의 값을 출력해본다.
        System.out.println("---- 사칙연산1 ----");

        int a = 11;
        int b = 22;
        int c = 33;
        int d = 44;

        int sum = a + b + c + d;
        System.out.println("sum = " + sum);


//        3. 사칙 연산 문제 2
//        정수형 변수 2개를 선언하고 값을 할당한다.
//        값이 할당된 정수형 변수 2개의 곱을 구해 새로운 정수형 변수에 할당한다.
//        곱이 할당된 변수의 값을 출력해본다.
        System.out.println("---- 사칙연산2 ----");

        int i = 32;
        int j = 98;

        int multi = i * j;
        System.out.println("multi = " + multi);

//        4. 사칙 연산 문제 3
//        정수형 변수 2개를 선언하고 값을 할당한다.
//        값이 할당된 정수형 변수 2개의 나누기 몫을 구해 새로운 정수형 변수에 할당한다.
//        나누기 몫이 할당된 변수의 값을 출력해본다.
        System.out.println("---- 사칙연산3 ----");

        int n = 52;
        int m = 5;

        int division = n / m;
        System.out.println("division = " + division);


//        5. 사칙 연산 문제 4
//        정수형 변수 2개를 선언하고 값을 할당한다.
//        값이 할당된 정수형 변수 2개의 나누기 나머지를 구해 새로운 정수형 변수에 할당한다.
//        나누기 나머지가 할당된 변수의 값을 출력해본다.
        System.out.println("---- 사칙연산4 ----");

        int x = 96;
        int y = 4;

        int remainder = x % y;
        System.out.println("remainder = " + remainder);
    }
}
