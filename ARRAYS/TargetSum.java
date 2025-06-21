package ARRAYS;

public class TargetSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(target2(arr,8));
    }

 
    
  
    static boolean target2(int arr[],int target){
        int l=0;
        int r = arr.length-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[l]+arr[r]>target){
                r--;
            }
            else if(arr[l]+arr[r]<target){
                l--;
            }
            else if (arr[l]+arr[r]==target){
                int c = arr[l]+arr[r];
                return true;
            }
            }
            return false;
        }
    }

