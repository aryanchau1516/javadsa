package GeekforGeeks;

public class Missingnum {
        int missingNumber(int n, int arr[]) {

       
        int totalSum = n * (n + 1) / 2;
            int arraySum = 0;
            for (int num : arr) {
                arraySum += num;
            }
            return totalSum - arraySum;
    }

// missing num = expecteSum-actualSum;
// long expecteSum=n*(n+1)/2;
  static  long missingNumber(int arr[]) {
               
            long n = arr.length+1;
            long expecteSum=n*(n+1)/2;
            long actualSum=0;
            for(int num:arr){
                actualSum+=num; 
            }
            return expecteSum-actualSum;
       
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,5};
       
       // System.out.println(n);
        System.out.println(missingNumber(arr));
      }
   
}