// Sorting ///// ///
// bubble Sorting

// dfsvfdgvf

public class Current {

    for(
    int i = 0;i<arr.length;i++)
    {
            System.out.print(arr[i]+ " ");
            
        }

    }

    public  static void main(String[] args) {
        int arr[] = {7,8,3,1,2};  
    
        //bubble sort    
        for (int i = 0; i < arr.length-1; i++) {
            for (int j  = 0; j < arr.length-i-1; j++) {
                if (arr[j]>a rr[j+1]) {
  
                    //swa p  

                 

             

                
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













// Array /// 

// calculate thr suum of all the array in the given array
public class current {
    void sumofarray(){
        int arr[] = {2,4,5,7};
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];

        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        current obj = new current();
        obj.sumofarray();         
    }
}


















// find the bigggest element in the array 

public class current {
    void biggestarray(){
        int arr[] = {2,4,5,7};
        int bigggest =0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>bigggest) {
                bigggest = arr[i];
                
            }
            
        }
        System.out.print(bigggest);

    }
    
    public static void main(String[] args) {
        current obj = new current();
        obj.biggestarray();         
    }
}












// find the bigggest element in the array 

public class current {
    void biggestarray(){
        int arr[] = {2,4,5,7};
        int bigggest =0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>bigggest) {
                bigggest = arr[i];
                
            }
            
        }
        System.out.print(bigggest);

    }
    
    public static void main(String[] args) {
        current obj = new current();
        obj.biggestarray();         
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
