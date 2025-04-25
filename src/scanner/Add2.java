package scanner;

import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        System.out.println("첫 번째 숫자를 입력하시오 : "); //줄을 바꾸지 않습니다.
        x = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하시오 : "); //줄을 바꾸지 않습니다.
        y = sc.nextInt();

        sum = x + y;
        System.out.println(sum); // 합을 출력한다.



    } //end of main

}// end of class
