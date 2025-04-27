package Chapter3;

import java.util.Scanner;

public class Grading {

    //코드의 진입점
    public static void main(String[] args) {

        //종종 우리는 조건에 따라 다중으로 분기되는 결정을 내려야 하는 경우가 있다.
        //학생들의 성적을 받아서 학점을 출력하는 프로그램을 작성하여 실행하여 보자. 성적이
        //90점이상이면 A학점, 80점 이상이고 90점 미만이면 B학점 , 70점 이상이고 80점 미만이면 C학점과 같이 결정한다.

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력해주세요 : ");
        int score = sc.nextInt();

        if (0 <= score && score <= 100){
            if(score >= 90){
                System.out.println("A 학점입니다.");
            }else if(score >= 80){
                System.out.println("B 학점 입니다.");
            }else if(score >= 70){
                System.out.println("C 학점입니다");
            }else{
                System.out.println("F 학점입니다.");
            }
        }else{
            System.out.println("잘못된 점수입니다. 다시입력해주세요");
        }




    } // end of main

} // end of class
