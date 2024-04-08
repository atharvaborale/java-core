package com.ps9;

public class Queue4 {
	private int front, rear, capacity;
    private int queue[];

    Queue4(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    void enqueue(int data) {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
    }

    void dequeue() {
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
    }

    void display() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    public static void main(String[] args) {
    	Queue4 q = new Queue4(4);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.print("Elements in queue: ");
        q.display();

        q.dequeue();
        System.out.print("\nAfter removing first element: ");
        q.display();
    }
}
