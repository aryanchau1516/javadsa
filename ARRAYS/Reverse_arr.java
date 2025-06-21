package ARRAYS;

import java.util.Arrays;

public class Reverse_arr {
    int[] reverse(int arr[]){
        for(int i=0;i<arr.length%2;i++){
          swap(arr, i);
        }

        return arr;
    }
    int[] swap(int arr[],int i){
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1]=arr[i];
        return arr;
    }
    public static void main(String[] args) {
        Reverse_arr obj = new Reverse_arr();
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(obj.reverse(arr)));
    }
}
