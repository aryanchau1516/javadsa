package ARRAYS;
import java.util.*;
public class Largest1 {
    public static void main(String[] args) {
        int arr[] = {3,43,434,1212,2131,3133};
        Largest1 obj = new Largest1();
        obj.largest12(arr);
        obj.small2(arr);
        System.out.println(obj.bin(arr,2331));
    }
     void largest12(int arr[]){
        int large=(Integer.MIN_VALUE);
       
       for(int i=0;i<arr.length;i++){
            if (arr[i]>large) {
                large=arr[i];
               
            }
        
        }
        System.out.println("lage ="+large);    
    }
    void small2(int arr[]){
        int min=(Integer.MAX_VALUE);
        System.out.println((min+1));
       
       for(int i=0;i<arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
               
            }
        
        }
        System.out.println("min ="+min);    
    }
     int bin(int arr[],int serach){
        int start=0;
        int end=arr.length-1;
       
        while (start<=end) {
            int mid=(start+end)/2;
            if (arr[mid]==serach) {
               return arr[mid];
            } 
            else if (arr[mid]>serach) {
                end=mid-1;
            }  
            else if (arr[mid]<serach) {
                start=mid+1;
            }     
        }
        return -1;
     }
}
