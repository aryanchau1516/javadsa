


package twopointer11;

import java.util.Arrays;

/*
 * the question is that a given arr in non decreasing order and produce square of each number 
 * in non decreasing order
 */
public class SqureNum {
    int[] squarenum(int[] arr) {
        int n = arr.length ;
        int start= 0;
        int end = n-1;
        int[] ans = new int[n];
        int k = n-1;
        while (start<=end) { 
            if (Math.abs(arr[start]) > Math.abs(arr[end])) {
                ans[k--] = arr[start] * arr[start]; // filling in ans in revrse order means last pos
                
                start++;
                
            }
            else {
                ans[k--] = arr[end]*arr[end];
                end--;
               
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { -10, -3, -2, 1, 4, 5 };
        SqureNum obj = new SqureNum();
        int[] result = obj.squarenum(arr);
      
         System.out.println(Arrays.toString(result));
    }
    
}
