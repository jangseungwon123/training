package Chapter3;

public class ArrayTest4 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};
        for(int value : numbers){
            System.out.print(value + " ");
        }
        for (int i =0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

    } // end of main
} // end of class
