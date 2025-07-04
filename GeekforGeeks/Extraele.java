// package GeekforGeeks;

// public class Extraele {
//     public static void main(String[] args) {
        
//     Extraele obj = new Extraele();

//     int arr1[]={11,22};
//     int arr2[]={11,};
//     int n =2;
//     System.out.println(obj.findExtra(n, arr1, arr2));
//     }
//     public int findExtra(int n, int arr1[], int arr2[]) {
//         // add code here.
//         for(int i=0;i<n;i++){
//             if(arr1[i]!=arr2[i]){
//                 return i;
//             }
           
//         }
//          return -1;
//     }
// }

//https://www.geeksforgeeks.org/explore?page=2&sortBy=submissions&itm_source=geeksforgeeks&itm_medium=main_header&itm_campaign=practice_header
package GeekforGeeks;

public class Extraele {
    public static void main(String[] args) {
        
        Extraele obj = new Extraele();

        int arr1[] = {25,26 };
        int arr2[] = {26};
        int n = 2; // Get the length of the smaller array
        System.out.println(obj.findExtra(n, arr1, arr2));
    }
    
    public int findExtra(int n, int arr1[], int arr2[]) {
        int t = Math.min(arr1.length, arr2.length);
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return i;
            }
        }
        // If no extra element found in the smaller array, return the index at which the extra element exists in the longer array
        return arr1.length == t ? arr1.length : arr2.length;
    }
}

// https://www.geeksforgeeks.org/explore?page=1&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions&sprint_name=Love%20Babbar%20Sheet
