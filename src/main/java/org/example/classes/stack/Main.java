package org.example.classes.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(20);

        stack.getTop();
        stack.getHeight();

        stack.push(30);

        stack.pop();
        stack.printStack();
    }
}
