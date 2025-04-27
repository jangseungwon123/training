package operator;

public class BitOperator {

    public static void main(String[] args) {

        byte status = 0b01101110;
        // 비트 AND &
        //비트 단위로 두 숫자를 비교해서 둘 다 1일때마만 1 아니면 0을 결과로 내는 연산
        System.out.println("문 열림 상태 = " + ((status & 0b0000100) != 0));

    } // end of main

}// end of class
