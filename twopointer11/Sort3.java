package twopointer11;

/* sort in this way in begin evven num and in end odd num
        int[] arr = { 1, 2, 3, 4, 5, 67, 8 ,22,44,66,77,88,32,46};
 * [46, 2, 32, 4, 88, 66, 8, 22, 44, 67, 77, 5, 3, 1]
 */
import java.util.Arrays;

public class Sort3 {

    int[] sort(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (arr[start] % 2 == 0) {
                start++;
            } else if (arr[end] % 2 != 0) {
                end--;
            } else {
                swap(arr, start, end);
                start++;
                end--;
            }

        }
        return arr;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
   }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 67, 8 ,22,44,66,77,88,32,46};
        Sort3 obj = new Sort3();
        int[] result = obj.sort(arr);
        System.out.println(Arrays.toString(result));
    }
    
}
