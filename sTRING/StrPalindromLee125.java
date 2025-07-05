public class StrPalindromLee125 {

    class Solution {
        public boolean isPalindrome(String s) {
            if (s.length() == 1) {
                return true;
            }
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    sb.append(ch);
                } else if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch - 'A' + 'a');
                    sb.append(ch);
                } else if (ch >= '0' && ch <= '9') {
                    sb.append(ch);
                }
            }

            // now checking it is palindrome or not
            int start = 0;
            int end = sb.length() - 1;
            while (start < end) {
                char schar = sb.charAt(start);
                char echar = sb.charAt(end);
                if (schar != echar) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
}