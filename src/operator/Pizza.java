package operator;

public class Pizza {

    public static void main(String[] args) {

        double radius =3.141592;
        double area1 = 2 * radius * 20 * 20;
        double area2 = radius * 30 * 30;
        System.out.println("20cm 피자 면적 = " + area1);
        System.out.println("30cm 피자 면적 = " + area2);
        System.out.println((area1 > area2) ? "20cm 두개 " : "30cm 한개");

    } // end of main

} // end of class
