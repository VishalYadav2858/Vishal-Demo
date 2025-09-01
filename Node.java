/////////// Linkedlist //////

// manual aise bnate h

import java.util.*;

public static void Node(int head) {

    while (head!= null) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
}

public class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;

    }

    public static void main(String[] args) {

        Node a = new Node(2);
        Node b = new Node(9);
        Node c = new Node(7);
        Node d = new Node(6);
        Node e = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node temp = a;

    }
}
