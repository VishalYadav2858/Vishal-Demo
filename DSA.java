// Sorting ///// ///
// bubble Sorting
// har element ke sath compare hotah to auto last me chala jata h biggest element 
public class DSA {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printArray(arr);
    }
}
































// selection sort
// is case me 1st ko smallest man liya fir usko compare kihya agr doosra
// smallest h to usko smallest bnado aisa poora loop run hoga fir last smallest
// ko swap krdenge firt ke sath

public class DSA {

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

    }






























    // insertion sort
    // is case me 2 part me divide krdete h sorted and unsorted aur unsorted ko
    // sorted me lejate h to sorted bda hota jata h

    public class DSA {

        public static void printArray(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int arr[] = { 7, 8, 3, 1, 2 };

            // selection sort

            for (int i = 1; i < arr.length; i++) {
                int current = arr[i];
                while (j >= 0 && curren <= arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            }

            // placement
            arr[j + 1] = current;
        }

        printArray(arr);
    }
    }














    







/// Quick sort

public class DSA {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // pivot index
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}




































// Merge sort
public class DSA {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++; idx1++;
            } else {
                merged[x] = arr[idx2];
                x++; idx2++;
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merged[x] = arr[idx2];
            x++; idx2++;
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        

        divide(arr, 0, arr.length - 1);

        // Print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

































// linear search 

public class DSA {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7};
        int key = 5;
        int index = linearSearch(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}






















// binary search

public class DSA {
    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid; // found
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8}; // must be sorted
        int key = 5;
        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}

























    // Array ///

    // calculate thr suum of all the array in the given array
    public class DSA {
        void sumofarray() {
            int arr[] = { 2, 4, 5, 7 };
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];

            }
            System.out.println(sum);
        }

        public static void main(String[] args) {
            DSA obj = new DSA();
            obj.sumofarray();
        }
    }

    // find the bigggest element in the array

    public class DSA {
        void biggestarray() {
            int arr[] = { 2, 4, 5, 7 };
            int bigggest = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > bigggest) {
                    bigggest = arr[i];

                }

            }
            System.out.print(bigggest);

        }

        public static void main(String[] args) {
            DSA obj = new DSA();
            obj.biggestarray();
        }
    }

    // find the bigggest element in the array

    public class DSA {
        void biggestarray() {
            int arr[] = { 2, 4, 5, 7 };
            int bigggest = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > bigggest) {
                    bigggest = arr[i];

                }

            }
            System.out.print(bigggest);

        }

        public static void main(String[] args) {
            DSA obj = new DSA();
            obj.biggestarray();
        }
    }

    // Search if the element is present -> return index or else -1
    public class DSA {
        public int presentElement(int element) {
            int arr[] = { 2, 4, 5, 7 };

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    return i; // return index
                }
            }
            return -1; // not found
        }

        public static void main(String[] args) {
            DSA obj = new DSA();
            int elementToSearch = 5; // try changing this value
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
            int arr[] = { 2, 4, 5, 7 };

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
































/////////// Linkedlist //////

// manual aise bnate h


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


