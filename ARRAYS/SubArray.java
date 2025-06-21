package ARRAYS;

public class SubArray {
    static void subArray1(int arr[]){
        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<=arr.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
        subArray1(arr);
        int totalaubArray =(arr.length*(arr.length+1))/2;
        System.out.println(totalaubArray);
    }
    
}
