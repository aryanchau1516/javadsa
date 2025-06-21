package Recursion;

public class DecreaseNum {
    static void decrese(int num){
        if(num==1){  // this is the base case
            System.out.print(1);
            return;
        }
        System.out.print(num+" ");
        decrese(num-1);
    }
    static void increase(int n){
        if(n==1){ // base condition hint explain on call stack
            System.out.print(1+" ");
            return;
        }
        increase(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        decrese(13);
        System.out.println();
        increase(12);
    }
    
}
