package variable;

public class TybeConversion {
    public static void main(String[] args) {


        int i;
        double f;

        f = 1 / 5;
        System.out.println(f); // 두수가 정수이기에 값은 0

        f = (double) 1 / 5;
        System.out.println(f);//하나라도 실수인 값이 있기에 0.2

        i = (int) 1.7 + (int)1.8; //int로 변환후 계산하기에 답은 2이다 1 + 1이 된다.
        System.out.println(i);

    }
}
