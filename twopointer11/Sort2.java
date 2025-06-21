package twopointer11;

import java.util.Arrays;

public class Sort2 {

    int[] sort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] == 0) {
                start++;
            } else if (arr[end] == 1) {
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
        int[] arr = {1, 0,1,0,0,0,1, 0, 1, 1, 0, 1, 0, 1};
        Sort2 obj = new Sort2();
        int[] result = obj.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
