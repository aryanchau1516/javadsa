package string;

public class ReverseStr {
    public static void main(String[] args) {
        ReverseStr obj = new ReverseStr();
        System.out.println(obj.Reverse("Aryan"));
    }
    
    public String Reverse(String str) {
        
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        return new String(arr);
    }
    
}
