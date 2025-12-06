import java.util.Scanner;

class Stack {
    int top;
    int[] stack;
    int size;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == size - 1)
            System.out.println("Stack Overflow!");
        else
            stack[++top] = value;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow!");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    void display() {
        if (top == -1)
            System.out.println("Stack is empty!");
        else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++)
                System.out.print(stack[i] + " ");
            System.out.println();
        }
    }
}

class Queue {
    int front, rear, size;
    int[] queue;

    Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    void enqueue(int value) {
        if (rear == size - 1)
            System.out.println("Queue Overflow!");
        else {
            if (front == -1)
                front = 0;
            queue[++rear] = value;
        }
    }

    void dequeue() {
        if (front == -1 || front > rear)
            System.out.println("Queue Underflow!");
        else
            System.out.println("Dequeued: " + queue[front++]);
    }

    void display() {
        if (front == -1 || front > rear)
            System.out.println("Queue is empty!");
        else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++)
                System.out.print(queue[i] + " ");
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(5);
        Queue queue = new Queue(5);

        // Stack operations
        System.out.println("\n--- Stack Operations ---");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();

        // Queue operations
        System.out.println("\n--- Queue Operations ---");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        queue.dequeue();
        queue.display();

        sc.close();
    }
}
