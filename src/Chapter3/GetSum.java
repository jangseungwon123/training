package Chapter3;

import java.util.Scanner;

/**
 * while 문을 조건으로 반복할때 사용된다.
 * -1 값이 입력될때 까지 ,사용자가 입력한 정수의 합계를 계산하여 출력하는  프로그램을 작성하자.
 */
public class GetSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int value = 0;

        while(value != -1){
            System.out.printf("정수값을 입력하세요 :");
            value = sc.nextInt();
            sum = sum + value;
        }
        System.out.println("정수의 총 합은 : " + sum + "입니다.");

    } //end of main

} // end of class
