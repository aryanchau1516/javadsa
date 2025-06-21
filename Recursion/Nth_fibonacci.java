package Recursion;

public class Nth_fibonacci {
    static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
        int t1=fibo(n-1);
        int t2 = fibo(n-2);
        int nth = t1+t2;
        return nth;
    }
    
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    
}
