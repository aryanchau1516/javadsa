package Recursion;


public class Frst_Occourence {
    static int occour(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return occour(arr, key, i+1);
    }
    public static void main(String[] args) {

        int[] arr = {1,1,33,4,6,77,77,4,4,9};
        occour(arr, 4, 0);

        System.out.println( occour(arr, 5, 0));
    }
    
}
