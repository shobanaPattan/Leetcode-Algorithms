import java.util.Stack;

public class ValidParentheses {

    static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){

      String str = "()[]";

        System.out.println(isValid(str));
    }
}

//Input - String, output - boolean
//Create an empty stack
//For loop to convert string to character using toCharArray()
//Check if each char is either ( or [ or { then push into stack
//Else check if the stack is empty then return false
//Peek the top element in stack if top is ( or [ or { and character is ) or ] or } then pop
//Check if the stack is empty