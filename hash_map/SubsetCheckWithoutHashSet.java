 package hash_map;

import java.util.HashSet;

public class SubsetCheckWithoutHashSet {

    boolean checkSubArray(int[] a, int[] b){
        
        // for(int i =0;i<b.length;i++){
        //     boolean found = false;
        //     for(int j =0;j<a.length;j++){
        //         if(b[i]==a[j]){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         return false;
           // }
        //}

        return true;

    }


    /*
     * this checkSubArray2 methos is use for better time complexity 0(n)
     * using hashset 
     */
    boolean checkSubArray2(int [] a , int[] b){

        HashSet<Integer> set = new HashSet<>();
        for(int num : a){
            set.add(num);
        }

       for(int num : b){
        if(!set.contains(num)){
            return false;
        }
       }



        return true;
    }

    public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6,7} ;
    int b[]= {2,4,7,8};
    SubsetCheckWithoutHashSet obj = new SubsetCheckWithoutHashSet();
    
    System.out.println(obj .checkSubArray2(a, b));
    }

}