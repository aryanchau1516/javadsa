package Recursion;

public class Factorial_1 {
    static int fact(int n){
        if(n==0){
            return 1; //base case   
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
    
}
