package com.ps9;

public class Queue5 {
	
	static class Node {
	    int data;
	    Node next;
	}

	static class Queue {
	    Node front, rear;

	    void enqueue(int data) {
	        Node node = new Node();
	        node.data = data;
	        node.next = null;
	        if (front == null) {
	            front = node;
	            rear = node;
	        } else {
	            rear.next = node;
	            rear = node;
	        }
	    }

	    void dequeue() {
	        if (front == null) {
	            return;
	        }
	        front = front.next;
	        if (front == null) {
	            rear = null;
	        }
	    }

	    void display() {
	        Node temp = front;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	
	    public static void main(String[] args) {
	        Queue q = new Queue();
	        q.enqueue(89);
	        q.enqueue(99);
	        q.enqueue(109);
	        q.enqueue(209);
	        q.enqueue(309);

	        System.out.print("Elements in queue: ");
	        q.display();

	        q.dequeue();
	        q.dequeue();

	        System.out.print("After removing two elements: ");
	        q.display();
	    }
	}

}
