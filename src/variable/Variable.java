package variable;

import java.util.HashMap;

public class Variable {
    //TODO
    int sum;
    long employee_id; // '_' 사용가능

    class Sprite10 {
    } //숫자 사용가능

    void get_$() {
    } //'$' 문자 사용 가능

    //TODO잘못된 식별자의 예
//    int 1stPrizeMoney; // 첫 글자가 숫자
//    double super; //키워드
//    int #ofComputer; //허용되지 않는 기호
//    class %_df_Money{  }; //허용되지 않는 기호

    //TODO문자형
    char ch1 = '가';      //2바이트
    char ch2 = '\uac00';  //'가'를나타낸다
    char ch3 = '가';      // 2바이츠

    //TODO리터널(literal)- 정수형 ,부동소수점형,문자형등등
    //  x= 100; 에서 100과 같이 소스 코드에 직접 쓰여 있는 값을 의미한다.

    //TODO부동소수점형 리터널
    final double LIGHT_SPEED = 3e5; //빛의 속도 300000은 3e5와 같이 지수를 사용해도 된다. 3e5은 3 *10^5을 나타냄

    float temperature = 12.3F; // f나 F를 붙이면 float형 리터럴이된다.

    //TODO논리형 리터널

    boolean flag = true;
    boolean x = 1 < 2; // false가 저장된다.

    //TODO상수(constant)- 프로그램이 실행하는 동안,값이 변하지 않는 수
    final double PI = 3.141592;
    //PI = 3.141593; //초기값과 달라서 컴파일 오류;

    //TODO변수 타입 추론 기능
    //TODO 자바는 변수를 지정할 때, 변수 타입을 명확히 밟혀야 한다.
    int age = 22;
    String name = "kim";

//    //TODO지역함수에서 사용가능한 var
//    public static void main(String[] args) {
//        var age = 22; // age 는 int 타입으로 추론
//        var name = "kim"; //name은 String타입으로 추론
//
//        MAP<String,String> map = new HashMap<String,String>();
//        var map = new HashMap<String,String>();
//
//        var id = 0; //충분한 정보가 없어 정수형으로 가정;
//        var sum; //변수를 sum의 타입을 추측할 정보가 부족함, 컴파일 오류
//    }

    //TODO문자열 -문자들의 모임이다.
    String s1 = "Hello";
    String s2 = "World!";
//    System.out.println(s1 +s2); //"Hello World!"가 출력된다.
//
//    int age = 20;
//    System.out.println("내년이면 " + age + "살");

    //TODO형변환 -때로는 하나의 자료형을 다른 자료형으로 변환하는것이 필요하다 이것을 형변환(tybe conve-rsion)이라고한다.
    //자동적인형변환- 연산자 타입이 같아야하며 수식을 계산할 때는 가장 범위가 넓은 피연산자의 타입으로 변환된다.
    double sum1 = 1.3 + 12; //1.3 + 12.0으로 변환된다.

    //강제적인 형변환-반환하려는 값의 앞에 원하는 자료형을 적어주면 된다.
    // 더작은 크기의 자료형에 저장하는 형변환은 정보를 잃을 수 있다.
    int x1 = 3;
    double y = (double) x1;


}

