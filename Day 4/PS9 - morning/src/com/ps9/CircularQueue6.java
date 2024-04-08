package com.ps9;

public class CircularQueue6 {
	    private int front, rear, size;
	    private int queue[];

	    CircularQueue6(int c) {
	        front = rear = 0;
	        size = c;
	        queue = new int[size];
	    }

	    void enqueue(int data) {
	        if ((rear + 1) % size == front) {
	            System.out.println("Circular Queue is full\n");
	            return;
	        }
	        rear = (rear + 1) % size;
	        queue[rear] = data;
	    }

	    void dequeue() {
	        if (front == rear) {
	            System.out.println("Circular Queue is empty\n");
	            return;
	        }
	        front = (front + 1) % size;
	    }

	    void displayQueue() {
	        if (front == rear) {
	            System.out.println("No Elements in the Circular Queue");
	            return;
	        }
	        for (int i = front + 1; i <= rear; i++) {
	            System.out.print(queue[i] + " ");
	        }
	        System.out.println();
	    }
	
	    public static void main(String[] args) {
	    	CircularQueue6 q = new CircularQueue6(5);

	        q.enqueue(14);
	        q.enqueue(13);
	        q.enqueue(22);
	        q.enqueue(-8);

	        System.out.print("Elements in circular queue: ");
	        q.displayQueue();

	        q.dequeue();
	        System.out.print("After removing first element: ");
	        q.displayQueue();
	    }
	}


