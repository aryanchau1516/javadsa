package ARRAYS;

import java.util.Arrays;

public class Rev_1 {
    void reverse(int [] arr){
        for(int i =0; i<arr.length%2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Rev_1 obj = new Rev_1();
        obj.reverse(arr);
    }
    
}
