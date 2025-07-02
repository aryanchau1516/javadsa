import java.util.Stack;
public class FullBalBrct {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                Character ch = s.charAt(i);
                if (ch == '(' || ch == '[' || ch == '{') {
                    st.push(ch);
                }
                else {
                    if (st.isEmpty()) {
                        return false;
                    }
                    else if(ch==']')
                }
            }

        }
    }
    public static void main(String[] args) {
        FullBalBrct bt = new FullBalBrct();

    }
    
}
