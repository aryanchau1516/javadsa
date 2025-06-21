package ARRAYS;

import java.util.Arrays;

public class Reerse2 {

    void reverse2(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            end = arr[start];
            start = temp;

            start++;
            end--;
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Reerse2 obj = new Reerse2();
        // int arr[] ={1,2,3,4,5,6,7};
        // System.out.println(Arrays.toString(arr));
        // obj.reverse2(arr);

        String[] str = { "3", "30", "34", "5", "9" };
        Arrays.sort(str, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        System.out.println(str);

    }

}
