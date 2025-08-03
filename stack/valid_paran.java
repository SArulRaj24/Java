package stack;
import java.util.Stack;

class valid_paran {
    public static void main(String[] args) {
        String str = "){";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stk.push(s.charAt(i));
            } else {
                if (!stk.empty() && 
                    ((s.charAt(i) == ']' && stk.peek() == '[') ||
                    (s.charAt(i) == '}' && stk.peek() == '{') ||
                    (s.charAt(i) == ')' && stk.peek() == '('))) {
                    stk.pop();
                } else {
                    return false; // Return false if stack is empty or brackets don't match
                }
            }
        }
        return stk.empty(); // Return true if stack is empty after processing
    }
}