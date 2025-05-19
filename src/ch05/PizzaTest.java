package ch05;

public class PizzaTest {

    public static void main(String[] args) {

        Pizza p1 = new Pizza("super supreme");
        Pizza p2 = new Pizza("cheese");
        Pizza p3 = new Pizza("pepperoni");
        int n = Pizza.count;
        System.out.println("지금까지 판매된 피자 수는 : " + n);

    }// end of main
} // end of class
