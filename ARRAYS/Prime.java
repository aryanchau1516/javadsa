public class Prime {
    
    static int fibo(int n ){
        int a= 0; int b = 1;
        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
public static void main(String[] args) {
    System.out.println(fibo(50));
}
    
}