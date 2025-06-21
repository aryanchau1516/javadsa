package ARRAYS;

public class Pairs {
  static   void pairs(int arr[]){
    int count=0;// or (n*(n-1))/2  total event
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+arr[i]+ ","+arr[j]+")");
                count++;
            }
        }
        System.out.println(count);
     }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        pairs(arr);
    }

    
}
