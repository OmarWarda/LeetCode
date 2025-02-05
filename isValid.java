import java.util.Stack;

public class isValid {

    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                myStack.push(s.charAt(i));
            } else {
                System.out.println(s.charAt(i));
                if (!myStack.isEmpty() && s.charAt(i) == ')' && myStack.peek() == '(') {
                    myStack.pop();
                } else if (!myStack.isEmpty() && s.charAt(i) == ']' && myStack.peek() == '[') {
                    myStack.pop();
                } else if (!myStack.isEmpty() && s.charAt(i) == '}' && myStack.peek() == '{') {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }
        if (!myStack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "())";
        System.out.println(isValid(str));

    }

}
