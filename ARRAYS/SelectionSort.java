package ARRAYS;

import java.util.Arrays;

/*
 * pick the smallest from unsorted array and sets it to the beginning
 */
public class SelectionSort {

    static void bubble_Sort1(int arr[]){
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

    static void sort_1(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    System.out.println(Arrays.toString(arr));
    }

     
    public static void main(String[] args) {
        int arr[] = {-78,0,-112,4,-1,999,9,132};
        // sort_1(arr);
//    for(int i=0;i<arr.length;i++){
//     System.out.println(arr[i]);
//    }
bubble_Sort1(arr);
    }
    
}
