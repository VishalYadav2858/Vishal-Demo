// Quick sort
// Alogithm-------

// 1. 1 quicksort ka funtion bnaya jo  0 se n-1 tak mtlb low se high tk run krega 
// fir usko main funtion me call krenge 
// fir most import check krenge ki low pivot se chota h ki nhi 
// then ab 1 partition krne h na so quick sorrt funtion ko call 2 partition bnalenge 
// now ab partition method me pivot ki position set krenge aur i variable se track rkenge to usko i = low-1 se initialise krenge that mean abhi koi bhi pivot se chota nhi h
// ab swapp krenge i ko j ke sath
// last me bachta h pivot to uske liye 1 khali jagah bnake usko wha pe swap krna fir i retun krenge jo pivot ka index hai

public class Current {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high ; j++) {
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
        return i;
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quicksort(arr, low, pidx - 1);
            quicksort(arr, pidx + 1, high);

        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 9, 2, 1, 8 };
        int n = arr.length;
        quicksort(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }   

}
