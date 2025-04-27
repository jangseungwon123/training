package Chapter3;

import java.util.Scanner;

public class EvedOdd {

    // 함수의 진입점
    public static void main(String[] args) {

        // Scanner를 불러오자
        Scanner sc = new Scanner(System.in);
        // 키보드에서 입력받은 정수가 홀숭인지 짝수인지를 말해주는 프로그램을 작성해보자. 홀수와 짞수는 어떻게
        //구별할 수 있는가? 홀수로 나누었을 때 나머지가 1 이다. 짝수는 나누었을 때 나머지가 0 이다
        //따다서 나멎; 연산자 % 를 이용하여 구할 수 있다.
        System.out.print("정수값을 입력하세요 : ");
        int number = sc.nextInt();
        if(number > 0) {
            if ((number % 2) == 0) {
                System.out.println("짝수 입니다.");
            }else{
                System.out.println("홀수 입니다");
            }
        }else{
            System.out.println("양수의 정수 값을 입력하세요");
        }

    }// end of main

}// end of class
