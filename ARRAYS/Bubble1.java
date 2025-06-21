package ARRAYS;

import java.util.Arrays;

public class Bubble1 {
    static void sort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int swap =0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
                
            }
            if(swap==0){
                System.out.println(Arrays.toString(arr));
                return;
            }
        }
       
    }
    public static void main(String[] args) {
        int arr[]={-78,0,-112,4,-1,999,9,132};
        sort(arr);
    }
    
}
