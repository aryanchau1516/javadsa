import java.util.*;
import java.util.Stack;

public class BalenceBrckt {
    boolean checkBalBrct(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        BalenceBrckt bt = new BalenceBrckt();
        String brct = "((()))";
        System.out.println(bt.checkBalBrct(brct));
    }
}
