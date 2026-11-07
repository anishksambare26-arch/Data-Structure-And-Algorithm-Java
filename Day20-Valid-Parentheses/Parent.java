import java.util.Stack;

public class Parent {
    public static boolean Valid(String s) {
        // Create a Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Convert the string into a character array and traverse it
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }
        // If stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(Valid("()"));       
        System.out.println(Valid("(]"));       
        System.out.println(Valid("{[]}"));    
        System.out.println(Valid("("));        
    }
}
