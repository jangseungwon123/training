package Chapter3;

import java.util.Scanner;

/**
 * i 를 1부터  n 까지 1씩 증가시키면서 반복한다.
 * 만약 n을 i로 나누어서 나머지가 0이면
 * i를 약수로 출력한다
 */
public class Divisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("양의 정수를 입력하세요 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){ //만약 i 의 값이 0이라면 에러발생 나머지 연산자이기에 0으로 나눌 수 없기때문
            if((n % i) == 0 ){
                System.out.println("n 의 약수값은 : " + i);
            }
        }

    } // end of main

} // end of class
