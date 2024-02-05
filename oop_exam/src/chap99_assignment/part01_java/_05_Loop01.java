package chap99_assignment.part01_java;

public class _05_Loop01 {
    // 13. 반복문 while 문제
    // 안녕하세요? 를 5번 출력한다.
    public static void main(String[] args) {

        int count = 1;
        while (true) {
            if(count > 5) {
                return;
            }
            System.out.println("안녕하세요?");
            count++;
        }
    }
}
