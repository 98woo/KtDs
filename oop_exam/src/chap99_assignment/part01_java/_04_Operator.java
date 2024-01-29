package chap99_assignment.part01_java;

import java.util.Random;

public class _04_Operator {

    public static void main(String[] args) {

        Random random = new Random();

//        8. 비교 연산자 문제
//        실수형 변수 두 개를 선언하고 임의의 값을 할당한다.
//        두 값 중 큰 수만 출력한다.
        System.out.println("---- 비교연산자1 ----");
        double a = 10.58;
        double b = 9.30;

        double big = a > b ? a : b;
        System.out.println("big = " + big);

//        9. 비교 연산자 문제 2
//        실수형 변수 세 개를 선언하고 임의의 값을 할당한다.
//        세 값 중 가장 작은 수만 출력한다.
        System.out.println("---- 비교연산자2 ----");
        double x = random.nextDouble() * 100;
        double y = random.nextDouble() * 100;
        double z = random.nextDouble() * 100;

        double small = (x > y ? y : x) > z ? z : (x > y ? y : x);
        System.out.println("x = " + x + ", y = " + y + ", z = " + z
                            + "\nsmall = " + small);

//        10. 비교 연산자 문제 3
//        실수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
//        다섯 값의 평균보다 큰 수들을 출력한다.
        System.out.println("---- 비교연산자3 ----");
        double[] dArr = new double[5];

        for(int i = 0; i < dArr.length; i++) {
            dArr[i] = random.nextDouble() * 100;
        }

        double average = (dArr[0] + dArr[1] + dArr[2] + dArr[3] + dArr[4]) / dArr.length;

        for (double d : dArr) {
            if (d > average) {
                System.out.println("result = " + d);
            }
        }


//        11. 논리 연산자 문제
//        정수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
//        다섯 값 중 2, 5, 8의 배수인 것들만 출력한다.
        System.out.println("---- 논리연산자1 ----");
        int[] iArr = new int[5];

        for(int i = 0; i < iArr.length; i++) {
            iArr[i] = random.nextInt(1, 1001);
        }

        for (int i : iArr) {
            if(((i % 8 == 0) && (i % 5 == 0)) && i % 2 == 0) {
                System.out.println("result = " + i);
            }
        }


//        12. 논리 연산자 문제 2
//        정수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
//        다섯 값 중 2 또는 5 또는 6의 배수인 것들만 출력한다.
        System.out.println("---- 논리연산자2 ----");
        int[] iArray = new int[5];

        for(int i = 0; i < iArray.length; i++) {
            iArray[i] = random.nextInt(1, 1001);
        }

        for (int i : iArray) {
            if(i % 2 == 0 || i % 5 == 0 || i % 6 == 0) {
                System.out.println("result = " + i);
            }
        }
    }
}
