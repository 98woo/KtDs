package chap99_assignment.part01_java;

import java.util.Scanner;

public class _05_Loop03 {
    // 15. 반복문 while 문제 3
    // Scanner 이용.
    // 정수형 변수 enemyHealthPoint 를 만들고 Scanner의 nextInt() 함수를 이용해 값을 할당한다.
    // 무한히 반복을 하면서 난수를 생성해 enemyHealthPoint의 값을 감소 시킨다.
    // 만약 enemyHealthPoint의 값이 0이 되거나 음수가 되면 "Victory!" 를 출력하며 반복문을 종료한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int enemyHealthPoint = sc.nextInt();
        int count = 0;

        while (true) {
            int num = (int) (Math.random() * 10);
            enemyHealthPoint -= num;

            if (enemyHealthPoint <= 0) {
                System.out.println("Victory! (" + count + "번 수행됨)");
                return;
            }
            count++;
        }
    }
}
