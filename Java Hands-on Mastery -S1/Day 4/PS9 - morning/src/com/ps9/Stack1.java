package com.ps9;

public class Stack1 {

	    private int maxSize;
	    private String[] stackArray;
	    private int top;

	    public Stack1(int size) {
	        maxSize = size;
	        stackArray = new String[maxSize];
	        top = -1;
	    }

	    public void push(String element) {
	        if (top < maxSize - 1) {
	            top++;
	            stackArray[top] = element;
	        } else {
	            System.out.println("Stack overflow! Cannot push element: " + element);
	        }
	    }

	    public String pop() {
	        if (top >= 0) {
	            String poppedElement = stackArray[top];
	            top--;
	            return poppedElement;
	        } else {
	            System.out.println("Stack underflow! Cannot pop element.");
	            return null;
	        }
	    }

	    public boolean isEmpty() {
	        return (top == -1);
	    }

	    public String peek() {
	        if (!isEmpty()) {
	            return stackArray[top];
	        } else {
	            return null;
	        }
	    }

	    public static void main(String[] args) {
	    	Stack1 stack = new Stack1(5);

	        // Pushing elements onto the stack
	        stack.push("Programming");
	        stack.push("java");
	        stack.push("world");
	        stack.push("Hello");

	        System.out.println("After Pushing 4 Elements: " + stack.toString());

	        // Popping an element from the stack
	        stack.pop();
	        System.out.println("After a Pop: " + stack.toString());
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i <= top; i++) {
	            sb.append(stackArray[i]);
	            sb.append(" ");
	        }
	        return sb.toString();
	    }

}
