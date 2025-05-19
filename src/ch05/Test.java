package ch05;

public class Test {

    int a; // 인스턴스 변수
    static int b; // 정적 변수

    void sub1() {a = 0; } // OK!!
    static void sub2(){}
       //  a = 0 ; //TODO 오류 ! 정적 메소드에서는 인스턴스 멤버를 사용하면 안됨

    public static int cube(int  x ){
        int result = x * x * x;
        return result;
    }
    static int number;
    static String s;
    // 자바 클래스에서 정적 블록(stactic block)은 클래스가 메모리에 로드될때 한 번만 실행되는 문장
    // 들의 집합이다. 정적 블록은 정적 초기화 블록이라고 한다. 일반적으로 정적 변수들을 초기화하 는
    //용도로 많이 사용된다.
    static { // 정적 블럭
        number =23;
        s = "Hellow World!";
    }



    public static void main(String[] args) { // main() 메소드도 정적 메소드임을 잊지말자
        // add(10,20); // TODO오류 정적 메소드 안에서 인스턴스 메서드 호출
        add(10,20);
        System.out.println("10*10*10 = :" + cube(10));
        System.out.println("number : " + number);
        System.out.println("s : " + s);

    }
    static int add(int x, int y){
        return x + y;
    }

//    static int add(int x, int y){
//        return x + y;
//    }
    // 주의 사항 정적 클래스 내부에서  this 사용안됨

}
