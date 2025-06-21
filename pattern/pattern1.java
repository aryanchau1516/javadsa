package pattern;

import java.util.Scanner;

public class pattern1 {                                                               
    // *
    // *  *
    // *  *  *
    // *  *  *  *
    // *  *  *  *  *
    // *  *  *  *  *  *
    // *  *  *  *  *  *  *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row of the pattern :");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
    
}
/*
 * public class StarPattern {
    public static void main(String[] args) {
        int rows = 7; // Number of rows for the pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");  // Print star with space
            }
            System.out.println();  // Move to the next line
        }
    }
}

 */