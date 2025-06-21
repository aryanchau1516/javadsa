
package pattern;


public class  pattern12 {
    public static void main(String[] args) {
        int n = 4; // Size of the arrow

        // Upper part of the arrow
        for (int i = 0; i < n; i++) {
            // Print left arrow part
            for (int j = 0; j < n; j++) {
                System.out.print("x ");
            }
            // Print spaces in the middle
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Print the rightmost 'x' of the upper part
            System.out.println("x");
        }

        // Middle part of the arrow
        for (int i = 0; i < n; i++) {
            System.out.print("x ");
        }
        for (int i = 0; i < n * 2 + 1; i++) {
            System.out.print("x ");
        }
        System.out.println();

        // Lower part of the arrow
        for (int i = n - 1; i >= 0; i--) {
            // Print left arrow part
            for (int j = 0; j < n; j++) {
                System.out.print("x ");
            }
            // Print spaces in the middle
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Print the rightmost 'x' of the lower part
            System.out.println("x");
        }
    }
}

    