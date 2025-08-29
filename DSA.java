// Sorting ///// ///
// bubble Sorting

// public class InnerDSA {
skjfxvlkcsdxvfx
    
// }




public class Current {

    public static void printarray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            
        }

    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {

                    //swap
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    
                }
                
            }
            
        }
        printarray(arr);
    }
} 














// selection sort

public class Current {

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // slection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;

                }

            }

            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printarray(arr);
    }
}






public class DSA {

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    public static class Stack {
        private Node head; // top of stack (❌ removed static)

        // check if stack is empty
        public boolean isEmpty() {
            return head == null;
        }

        // push method (✔ moved inside Stack class)
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println();
        System.out.println("Code runs without error now ✅");
    }
}
