package ch05;

public class Single {
    private static Single instance = new Single();
    private Single() {} //  전용 생성자

    public static Single getInstance(){
        return instance;
    }
}

class SingleTest{
    public static void main(String[] args) {
        Single obj1 = Single.getInstance();
        Single obj2 = Single.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);

    }
}
