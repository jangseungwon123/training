package Chapter3;

import java.util.Scanner;

/**
 * 사용자가 입력한 정수둘의 평균을 내는 프로그램을 작성한다.
 * 만약 사용자가 음수를 입력하면 break에 의하여 빈복 루프가 종료된다.
 */
public class Averager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0; int count = 0;

        while(true){
            System.out.println("정수를 입력하세요");
            int grade = sc.nextInt();
            if (grade < 0) break;
            total = total + grade;
            count++;
        }
        System.out.println(total/count);

    } // end of main

} // end of class
