import java.util.Stack;

public class evaluate_reverse_polish_notation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int len = tokens.length;
        for (int i = 0; i < len; i++) {
            if ("+".equals(tokens[i]))
                stack.push(stack.pop() + stack.pop());
            else if ("-".equals(tokens[i]))
                stack.push(-(stack.pop() - stack.pop()));
            else if ("*".equals(tokens[i]))
                stack.push(stack.pop() * stack.pop());
            else if ("/".equals(tokens[i])) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else stack.push(Integer.valueOf(tokens[i]));
        }
        return stack.pop();
    }
}
