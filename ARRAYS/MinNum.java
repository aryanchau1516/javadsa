package ARRAYS;

public class MinNum {
    static int minNum(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {-78,32,-1,-3,434,3546,54,2};
        System.out.println(minNum(arr));
    }
    
}
