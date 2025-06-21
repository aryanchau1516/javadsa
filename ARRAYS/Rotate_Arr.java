package ARRAYS;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
         int arr[] = {1,2,3,4,5,6};
 * [5, 6, 0, 0, 0, 0]
   [5, 6, 1, 2, 3, 4]
 */
public class Rotate_Arr {

    int [] rotate(int[] arr,int k){
        int n = arr.length;
        int j =0;
        k = k%n;
        int[] ans = new int[n]; // this is the new array
        
        for(int i = n-k;i<n;i++){
            ans[j++] = arr[i];    // [5, 6, 0, 0, 0, 0]  this store in this format
        }
        for(int i =0;i<n-k;i++){
            ans[j++]=arr[i];    // after  [5, 6, 1, 2, 3, 4]

        }

        return ans;
    }

   void rotate2(int[] arr,int k){
        int n = arr.length;
        int j =0;
        k = k%n;
        int[] ans = new int[n]; // this is the new array
        
        for(int i = n-k;i<n;i++){
            ans[j++] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
        for(int i =0;i<n-k;i++){
            ans[j++]=arr[i];

        }
        System.out.println(Arrays.toString(ans));

        
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Rotate_Arr obj = new Rotate_Arr();
       // System.out.println(Arrays.toString(obj.rotate(arr, 1)));
       obj.rotate2(arr, 2);
    }
    
}
