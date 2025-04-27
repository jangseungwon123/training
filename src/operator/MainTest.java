package operator;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        //TODO문제 1.
        //하나의 상자에 오렌지를 10개씩 담을 수 있다고 가정하자. 오렌지가 127개가 있다면
        //상자 몇개가 필요한가? 또 몇개의 오렌지가 남을까
//        int orange = 127;
//        System.out.println(orange / 10); // 오렌지가 담긴 박스의 수
//        System.out.println(orange %  10); // 나머지 연산자를 이용한 남은 오렌지수
        //TODO문제2.
        //마일을 킬로미터로 변환하는 프로그램을 작성하라. 1마일은 1.609킬로미터와 같다.
        //사용자로 부터 마일의 값을 읽어 들어인다.
         Scanner sc = new Scanner(System.in);
//        double mile = 1.609;
//        System.out.println("mile의 단위를 입력하세요 : ");
//        int distance = sc.nextInt();
//        System.out.println(distance * mile + " mile 입니다.");

        //TODO문제 3.
        //사용자로부터 두 개의 정수를 받아서 정수의 합, 정수의 차, 정수의 곱, 정수의 평균, 큰 수 , 작은 수를 계산하여
        //화면에 출력하는 프로그램을 작성하자.
        //큰 수와 작은 수를 구할 때는 조건 연산자를 사용하자.
//        int x = 10;
//        int y = 20;
//        System.out.println(x + y); // 30
//        System.out.println(x - y); // -10
//        System.out.println(x * y); // 200
//        System.out.println((x + y) / (double)2); // 15.0
//        System.out.println((x > y) ? " x " : " y "); // y
//        System.out.println((x > y) ? " y " : " x "); // x

        //TODO문제4.
        //사용자가 번개로부터 얼마나 멀리 떨어져 있는지를 계산하는 프로그램을 만들어 보자 . 소리는
        //공기를 통해 초당 약 340m 이동한다. 빛은 초당 300,000km를 이동한다. 번개를 본 시간과
        //소리가 도달한 시간 사이의 간격을 알면 번개까지의 거리를 계산할 수 있다. 시간 간격은 사
        //용자로 부터 입력받는다.
//        double soundDistance = 340;
//        System.out.println("번개가 내려치고 천둥을 몇초 뒤에 울렸나요? :");
//        int soundTime = sc.nextInt();
//        System.out.println("번개가 내리친 장소와의 거리는 ? : " + soundTime * soundDistance + " m 떨어진 장소입니다.");

        // TODO 문제 5.
        //상점에가면 우리는 상품에 대한 돈을 내고 영수증을 받는다. 영수증에는 10% 부가세와 잔돈등이 인쇄디어 있다.
        //구입한 상품의 가격과 손님한테 받은 금액을 입력하면 부가세와 잔돈을 출력하는 프로그램을 작성해보자.
//        boolean flag = true;
//        System.out.println("상품의 가격을 먼저 입력해주세요 : ");
//        int price = sc.nextInt();
//        int tax = price / 10;
//        System.out.println("손님에게 받은 결제 금액을 입력해주세요");
//        int costomerMoney = sc.nextInt();
//        while (flag) {
//        if(price <= costomerMoney) {
//            System.out.println("-----------------------------");
//            System.out.println("----------결재중입니다---------");
//            System.out.println("-----------------------------");
//            System.out.println("상품의 가격 : " + (price - tax));
//            System.out.println("부가세 :" + tax);
//            System.out.println("상품의 총 가격 : " + price);
//            System.out.println("지불 액 : " + costomerMoney);
//            System.out.println("거스름 돈 : " + (costomerMoney - price));
//            break;
//        }else{
//            System.out.println(" 잔액이 부족합니다 다시 지불해 주세요 : ");
//            costomerMoney = sc.nextInt();
//        }
//}
        //TODO 문제 6
        //사용자로부터 구의 반지름을 입력받아서 부피를 계산하여 출력하는 프로그램을 작성하라.
        //단 구의 반지름은 실수로 입력되며 출력도 모두 실수형으로 하여야한다. 부피를 계산하는 수식 4/3파이r^3이다.
//        double x = 3.141592;
//        double math= (double) 4/3;
//        System.out.println(" 구의 반지름을 입력하세요 : ");
//        double radius = sc.nextDouble();
//        double radius3 = radius *radius * radius ;
//        double volume = (math) * ( x ) * ( radius3 ) ;
//        System.out.println(math);
//        System.out.println(x);
//        System.out.println(radius3);
//        System.out.println("구의 부피는 : " + volume + " 입니다 ");
//
        //TODO 문제 7.
        //움직이는 물체의 운동에너지를 계산해보자. 물체의 에너지를 계산하는 식은 0.5 * 무게 * 속도 제곱이다
        System.out.println("물체의 무게(kg)를 입력하세요 :");
        double weight = sc.nextDouble();
        System.out.println("물체의 속도(m/s) 입력하세요 : ");
        double speed = sc.nextDouble();
        double force = 0.5 * weight * speed * speed;
        System.out.println("물체의 힘은 : " + force + "(J)의 에너지를 가지고 있다.");









    } // end of main
}// end of class
