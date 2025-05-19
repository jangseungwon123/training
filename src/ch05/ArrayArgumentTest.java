package ch05;

public class ArrayArgumentTest {

    public static double minArray(double[] list){
        double min = list[0]; // 초기값 설정

        for (int i = 1; i < list.length; i++){
            if(list[i] < min)  // int i 를 1로 설정했기에 1 부터 시작하고 돌아가면서 실행ㄴ
                min = list[i];
        }
        return (min);
    } // end of minArray

    public static void main(String[] args) {

        double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2 };
        double[] b = {-2.0, 3.0, -9.0 , 2.9 , 1.5};

        double min;

        min = minArray(a);
        System.out.println("첫 번째 배열의 최소값 = : " + min);
        min = minArray(b);
        System.out.println(" 두 번째 배열의 최소값 = : " + min);

    } // end of main
} // end of class

