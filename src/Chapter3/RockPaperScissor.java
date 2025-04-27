package Chapter3;

import java.util.Scanner;

/**
 *  가위 바위, 보 게임을 작성하여 보자 텍스트 버전은 여기서 작성하고 그래픽 버전은 8장에서
 * 작성해보자.
 * 사용자가 가위, 바위 ,보 중애ㅔ서 하나를 선택하면 이것을 컴퓨터가 생성한 난수값과 비교한다.
 * 누가 이겼는지 화면에서 출력한다.
 */
public class RockPaperScissor {

    final int SCISSOR = 0;
    final int ROCK = 1;
    final int PAPER = 2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Rock 2. Peper 0.Scissor : ");

        int user = sc.nextInt();
        int computer = (int)(Math.random()*3);
        if (user ==computer){
            System.out.println("비겼습니다.");
        }else if(user ==(computer + 1 )% 3){
            System.out.println("인간 : " + user + " 컴퓨터 :" + computer +  "\n인간승리");
            // TODO 나머지 연산시 3으로 나누면 1,2,3의 값중 1 과 2 는 나눌 수 없어 반환되어 1과 2가되고 3은 0인된다.
            // 숫자별로 원형 회전 시켰을을 오른쪽 시계방향쪽으로 +1한 숫자가 이기는 방식이라 위 식을 사용
        }else{
            System.out.println("인간 : " + user + " 컴퓨터 :" + computer +  "\n컴퓨터승리");
        }


    } //end of main

} // end of class
