import java.util.Stack;

public class REv {
    public static void main(String[] args) {
        String sentence = "my name is aryan";
        
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Create a stack to store the words
        Stack<String> stack = new Stack<>();
        
        // Push each word onto the stack
        for (String word : words) {
            stack.push(reverseWord(word));
        }
        
        // Pop the words from the stack and form the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop()).append(" ");
        }
        
        // Trim and print the final reversed sentence
        System.out.println(reversedSentence.toString().trim());
    }

    // Method to reverse a single word
    private static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder(word);
        return reversed.reverse().toString();
    }
}         q
