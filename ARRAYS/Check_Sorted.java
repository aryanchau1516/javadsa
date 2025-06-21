package ARRAYS;
// this program is for to chek to array i sorted or not
public class Check_Sorted {
    boolean check_sorted(int arr[]){
        boolean chek = true;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                chek =false;
            }
        }
        return chek;
    }
    public static void main(String[] args) {
        int arr[] =  {1,2,3,6,4,5};
      Check_Sorted obj = new Check_Sorted();
      System.out.println(obj.check_sorted(arr));
    }
}
