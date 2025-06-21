package ARRAYS;

public class second_bigarr {

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 7, 6, 5, 8, 1 };
        // int arr[] = new int[] {20,34,23,67,110,56,89};
        int max = -(Integer.MAX_VALUE);
        int smax = -(Integer.MAX_VALUE);
        // maximum2(arr, max, max2);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }
        }
        // System.out.println("maxgest element of the array :"+max);
        System.out.println("second largest number is :" + smax);

    }

    public static void maximum2(int arr[], int max, int max2) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
                System.out.println("second max : " + max2);
            }
        }
    }

}
