package ARRAYS;

public class Max_ele {
    int max(int arr[]){
        int max = Integer.MIN_VALUE; // - infnite number of int
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    int second_max(int arr[]){
        int max = Integer.MIN_VALUE; // - infnite number of int
        int second_max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                second_max =  max; // this is second max
                max=arr[i];
            }
        }
        return second_max;
    }
    int small_num(int arr[]){
        int small_num = Integer.MAX_VALUE; // + infinite number of int 
        for(int i =0;i<arr.length;i++){
            if(arr[i]<small_num){
                small_num = arr[i]; // it store small
            }
        }
        return small_num;
    }
    public static void main(String[] args) {
        Max_ele obj = new Max_ele();
        int arr[] = {4423,121,-21,4,32324,-32124,2112};
        System.out.println(obj.second_max(arr));
    }
    
}
