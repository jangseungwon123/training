package Chapter3;

public class NestedLoop {

    public static void main(String[] args) {

        for(int y = 0; y < 5 ; y++){
            for (int x = 0 ; x < 10; x++)
                System.out.print("*");// print로 옆으로 반복 10번
            System.out.println(""); //  println으로 밑으로 5번
        }


    }  // end of main

} // end of class`
