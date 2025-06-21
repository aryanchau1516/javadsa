package ARRAYS;
//{1,2,3,1,2}  // here 3 is unique num 
//not relevent

import java.util.Arrays;

public class Unique_Num {

    void uniqueNum(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

       
    }
    public static void main(String[] args) {
        Unique_Num obj = new Unique_Num();
        int arr[] ={1,2,1,1,2,3,1,3,1,2};
        obj.uniqueNum(arr);
    }
    
}
