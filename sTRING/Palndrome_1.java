package sTRING;



public class Palndrome_1 {

    static boolean palindrome(String str){
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "12211";
        System.out.println(palindrome(str));
    }
    
}
