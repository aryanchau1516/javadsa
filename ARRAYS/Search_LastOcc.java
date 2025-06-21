package ARRAYS;
// last occurance of earsh ele from the end
public class Search_LastOcc {

    int last_Occour(int[] arr , int search){
        int ans = -1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==search){
                ans = i;
                break;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] =  {2,12,22,32,8,42,11,13,23,42,32,333,32};
        Search_LastOcc obj = new Search_LastOcc();
        System.out.println(obj.last_Occour(arr, 41));
    
    }
    
}
