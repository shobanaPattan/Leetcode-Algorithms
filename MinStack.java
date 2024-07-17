import java.util.Stack;

public class MinStack {

     static Stack<Integer> stack;
     static Stack<Integer> ans;

    int min = Integer.MAX_VALUE;
    //Using two stacks
    public static void minStack(){
         stack = new Stack<>();
         ans = new Stack<>();
    }

    public static void push(int val){
        stack.push(val);
        if(ans.isEmpty()){
            ans.push(val);
            System.out.print("Push");
        } else if (val <= ans.peek()) {
            ans.push(val);
        }
    }

    public static void pop() {
        int a = stack.peek();
        int b = ans.peek();
        if (a == b) {
            stack.pop();
            ans.pop();
        } else
            stack.pop();
    }

    public static int top(){
        return stack.peek();
    }

    public static int getMin(){
        return ans.peek();
    }

    //using one stack
    public void minStackOne(){
        ans = new Stack<>();
    }

    public static void main(String[] args){
        int val = 6;

        minStack();
        push(5);
        pop();
       // System.out.println(top());

    }
}

//Has 5 parts
            //MinStack - initializes the stack
            //push() - pushes the values into stack
            //pop() - pops the value from the stack
            //top() - peeks the top element im the stack
            //getMin() - returns the minimum element from the stack