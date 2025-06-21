package ARRAYS;

public class Max_Num {

    int max_arr(int num[]){
        int max=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Max_Num obj = new Max_Num();
        int arr[]={32,332,322,899,3,-4,90,-3444};
        System.out.println(obj.max_arr(arr));
    }
    
}
