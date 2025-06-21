package twopointer11;


import java.util.Arrays;

public class Sort1 {
    public void sort1(int arr[]) {
        int count = 0;

        // Count number of 0s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        // Fill 0s
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }

        // Fill 1s
        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        Sort1 obj1 = new Sort1();
        obj1.sort1(arr);
    }
}
