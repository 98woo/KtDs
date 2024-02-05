package chap99_assignment.part01_java;

public class _05_Loop04 {

    public static void main(String[] args) {
//        16. 반복문 for 문제
//        1 부터 10 까지의 수를 출력한다.
        System.out.println("---- If1 ----");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }

//        17. 반복문 for 문제 2
//        1 부터 50 중 30~39 까지의 숫자만 출력한다.
        System.out.println("---- If2 ----");
        for (int i = 1; i < 51; i++) {
            if (30 <= i && i <= 39) {
                System.out.println(i);
            }
        }

//        18. 반복문 for 문제 3
//        구구단 2, 3단을 출력한다.
        System.out.println("---- If3 ----");
        for (int i = 2; i < 4; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + " = " + i*j);
            }
        }

//        19. 반복문 for 문제 4
//        구구단 2 ~ 9 단을 출력한다.
        System.out.println("---- If4 ----");
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
//                System.out.print(j + "x" + i + " = " + i*j + "  ");
                System.out.printf("%dx%d = %2d | ", j, i, i*j);
            }
            System.out.println("");
        }

//        20. 반복문 for 문제 5
//        1 부터 1000 중 소수(1과 자신으로만 나눌 수 있는 수)만 출력한다.
        System.out.println("---- If5 ----");
        int count = 0;
        for(int i = 2; i < 1001; i++) {
            for (int j = 2; j <= i; j++) {
                if(i == j) {
                    System.out.println(i);
                    count++;
                } else if (i % j == 0) {
                    break;
                }
            }
        }
        System.out.println("1 ~ 1000 중 소수는 총 " + count + "개");
    }
}
