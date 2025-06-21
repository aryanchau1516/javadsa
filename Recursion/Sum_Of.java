package Recursion;

public class Sum_Of {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int t = sum(n - 1); // analyse using call stack
        int sn = n + t;
        return sn;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }

}
