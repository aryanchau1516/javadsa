package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*
 * ciel number : is the smallest number i the array that is greater then or equal to the given value
 * arr = [1,2,8,10,10,12,19]
 * ciel of 5 = 8
 */

public class CielChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CielChar obj= new CielChar();
        char[] ch = new char[5];
        int ch2[] = new int[5];
     System.out.println("enter the  char");
        for(int i=0;i<ch.length;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
         System.out.println("character :"+Arrays.toString(ch));
         System.out.print("enter the targetted chRCTER :");
         char target = sc.next().charAt(0);
         int target2 = sc.nextInt();
         System.out.println("ciel of thIS CHARCTER IS :"+obj.cielChar(ch, target));
       System.out.println("ciel of thIS CHARCTER IS :"+obj.cielInt(ch2, target2));
    }
    char cielChar(char[] ch , char target)
    { int start =0;
        int end=ch.length-1;
        int mid;
        while (start<=end) {
             mid = start +(end- start)/2;
             if(target<ch[mid])
             {
                end=mid-1;
             }
             else{
                start= mid+1;
             }
            
        }
        System.out.println(start);
        System.out.println(ch.length);
        System.out.println(start % ch.length);



        return  ch[start % ch.length];
    }


    int cielInt(int[] ch , int target) // for number ciel number
    { int start =0;
        int end=ch.length-1;
        int mid;
        while (start<=end) {
             mid = start +(end- start)/2;
             if(target<ch[mid])
             {
                end=mid-1;
             }
             else{
                start= mid+1;
             }
            
        }
        System.out.println(start);
        System.out.println(ch.length);
        System.out.println(start % ch.length);



        return  ch[start % ch.length];
    }
}





// output.........


// character :[c, f, j, m, p]
// enter the targetted chRCTER :j
// ciel of thIS CHARCTER IS :m



// character :[c, f, j, m, p]
// enter the targetted chRCTER :p
// ciel of thIS CHARCTER IS :c