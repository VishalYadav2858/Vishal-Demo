/////////// Linkedlist //////

// manual aise bnate h

import java.util.*;

public class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;

    }

    // length methodd
    public static int length(Node head) {

        int count = 0;
        while (head != null) {
            head = head.next;
            count++;

        }
        return count;

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

        System.out.println(length(a));
        System.out.println("Length: " + length(a));
    }

}












