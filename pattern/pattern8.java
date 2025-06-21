package pattern;

import java.util.Scanner;

//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *

public class pattern8 {
    void pattern(int n) {
        for (int r = 0; r < 2 * n; r++) // use for the 5*2= 10 row
        {
            int CinR = r > n ? 2 * n - r : r; // after 5th reduce the row and for spacing logic
            int space = n - CinR;
            for (int s = 0; s < space; s++) // loop for spacing
            {
                System.out.print(" ");
            }
            for (int c = 0; c < CinR; c++) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the number of row :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern8 obj = new pattern8();
        obj.diamond(n);
    }

    public void diamond(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int r = row > n ? 2 * n - row : row;
            int space = n - r;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int i = 0; i < r; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}
