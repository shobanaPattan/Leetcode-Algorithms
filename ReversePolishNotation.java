import java.util.Stack;

public class ReversePolishNotation {

    static int polishNotation(String[] str) {

        Stack<Integer> stack = new Stack<>();
        String operator = "+-*/";

        for (String s : str) {

            if (operator.contains(s) && !stack.isEmpty()) {

                int op1 = stack.pop();
                int op2 = stack.pop();
                int ans = help(op2, s, op1);
                stack.push(ans);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    static int help(int op2, String s, int op1) {

        return switch (s) {
            case "+" -> op2 + op1;
            case "-" -> op2 - op1;
            case "/" -> op2 / op1;
            default -> op2 * op1;
        };
    }

    public static void main(String[] args){

        String[] str = {"9","11","-"};

        System.out.println(polishNotation(str));
    }
}

//Reverse polish notation - given array of strings as integers and operators (+,-,*,/), return solution of the expression
//input -Array of strings, output - int
//Create a stack and initialize a string variable as operator
//for loop to go each element, if you find integer then push into stack
//if you operator then pop two integers from stack n perform the operation