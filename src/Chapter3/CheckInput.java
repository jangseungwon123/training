package Chapter3;

import java.util.Scanner;

/**
 * 사용자로부터 월의 번호를 압력받는 프로그램을 작성하여 보자,
 * 사용자가 올바른 월 번호를 압룍헐 때까지 반복을 계속한다.
 * 사용자가 올바른 월 번호를 입력해야만 다음 문장으로 넘어간다.
 */
public class CheckInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int month;
        do {
            System.out.println("올바른 월을 입력하시오 [1-12]");
            month = sc.nextInt();
        } while (month < 1 || 12 < month);
        System.out.println("사용자가 입력한 월은 " + month);
    }

}
