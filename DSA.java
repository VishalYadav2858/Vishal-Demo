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



















// Search if the element is present -> return index or else -1
public class Current {
    public int presentElement(int element) {
        int arr[] = {2, 4, 5, 7};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i; // return index
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        Current obj = new Current();
        int elementToSearch = 5;   // try changing this value
        int index = obj.presentElement(elementToSearch);

        if (index != -1) {
            System.out.println("Element " + elementToSearch + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToSearch + " not found.");
        }
    }
}

















// reversing an array


public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7};

        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Reverse using for loop
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("\nReversed Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
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
