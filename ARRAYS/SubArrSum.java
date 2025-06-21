package ARRAYS;

public class SubArrSum {
  
    static void subArray1(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           
            for(int j=i;j<arr.length;j++){
               
                for(int k=i;k<=j;k++){
                   // System.out.print(arr[k]);
                    sum=sum+arr[k];
                   
                }
                System.out.println(sum);
                if (sum>max) {
                    max=sum;
                }
              
            }
            System.out.println();
            
          
            
        }
        System.out.println("max sub array is :"+max);
    }    
    public static void main(String[] args) {
        int arr[] = new int[] {1,-2,1,-1,3};
        subArray1(arr);
        int totalaubArray =(arr.length*(arr.length+1))/2;
        System.out.println(totalaubArray);
    }
    
}
