package chap99_assignment.part01_java;

import java.util.Scanner;

public class _05_Loop02 {
    // 14. 반복문 while 문제 2
    // Scanner 이용.
    // 2의 배수만 입력하는 문제를 만든다.
    // 만약, 2의 배수가 아니거나 0 또는 음수를 입력하면
    // "게임을 마칩니다" 를 출력하며 반복문을 종료한다.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int num = sc.nextInt();

            if((num % 2 != 0) || (num <= 0)) {
                System.out.println("게임을 마칩니다. \n(2의 배수 혹은 양수를 입력해주세요.)");
                return;
            }
        }
    }
}
