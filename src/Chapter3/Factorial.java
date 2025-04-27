package Chapter3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long fact = 1;
        System.out.println("정수의 값을 입력하세요 : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            fact = fact * i;
            System.out.println("%d!은 %d입니다 : " + n + "!은 " + fact );

        }



    } //end of main

} // end of class
