package stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.printStack();
        System.out.println("The top of the stack is " + stack.top());
        stack.pop();
        stack.printStack();
        System.out.println(stack.isEmpty());
        System.out.println("The top of the stack is " + stack.top());
    }
}
