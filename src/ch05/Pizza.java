package ch05;

public class Pizza {

    private String toppings;
    private int radius;
    static final double PI = 3.141492; //  상수정의
    static int count = 0; // 정적필드

    public Pizza(String toppings){
         this.toppings = toppings;
         count++;
    }

} // end of class
