package Chapter3;

public class TheaterSeats {
    public static void main(String[] args) {

        int[][] seats = {{1, 1, 1, 0, 0},
                         {1, 1, 0, 0, 0},
                         {1, 0, 0, 0, 0}  };
        int count = 0;
        for(int i =0; i < seats.length; i++)
            for(int y =0; y < seats[i].length; y++)
                count = count + seats[i][y];

        System.out.println("현재 관객수는 : " + count + "입니다.");//어째서 카운드가 세어졌을까?



    } // end of main
}// end of class
