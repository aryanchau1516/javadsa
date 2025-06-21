package ARRAYS;

import java.util.Arrays;

// in ths program we search the first occurance of the given array
public class Search_mulArr {
    int search_firstOcc(int arr[],int search){
        int ans = -1;  // -1 when its not found the search ele
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                ans=i;
                break;
            }
         }
        return ans;
    }
    public static void main(String[] args) {
        Search_mulArr obj = new Search_mulArr();
        int arr[] =  {2,12,22,32,8,11,13,23,42,32,333,32};
        int arr2[] =arr;
        System.out.println(Arrays.toString(arr2));
       // System.out.println(obj.search_firstOcc(arr, -32));
    }
    
}
