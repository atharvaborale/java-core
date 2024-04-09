package com.ps9;

import java.util.Scanner;

public class Node {

	    double data;
	    Node next;
	

	static class  Stack  {
	    Node top;

	    // Push operation
	    void push(double data) {
	        Node newNode = new Node();
	        if (top == null) {
	            newNode.data = data;
	            newNode.next = null;
	        } else {
	            newNode.data = data;
	            newNode.next = top;
	        }
	        top = newNode;
	    }

	    // Pop operation
	    void pop() {
	        if (top == null) {
	            System.out.print("\nStack Underflow");
	            return;
	        } else {
	            top = (top).next;
	        }
	    }

	    // Display operation
	    void display() {
	        if (top == null) {
	            System.out.printf("\nStack Underflow");
	            System.exit(1);
	        } else {
	            Node temp = top;
	            while (temp != null) {
	                System.out.printf("%.1f ", temp.data);
	                temp = temp.next;
	            }
	        }
	    }
	}
	    public static void main(String[] args) {
	    	
	    	Stack stack = new Stack();
	    	Scanner sc =new Scanner(System.in);
	    			
	    			System.out.println("Enter the number of elements you want to push onto the stack: ");
	    			int n =sc.nextInt();
	    			System.out.println("Enter the elements:");
	    			for (int i = 0; i < n; i++) {
	    			double data =sc.nextDouble(); 
	    			stack.push(data);
	    			}
	        System.out.print("The elements of the stack are: ");
	        stack.display();
	        System.out.println("null");

	        stack.pop();
	        stack.pop();

	        System.out.print("After popping twice: ");
	        stack.display();
	        System.out.println("null");
	    
	}
}

