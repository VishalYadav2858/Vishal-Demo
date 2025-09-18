import java.util.*;

public class Current {
    
    public static int FIFO_Page_Replacement(int[] pages, int capacity) {
        Queue<Integer> frames = new LinkedList<>(); // FIFO queue
        int pageFaults = 0;

        for (int page : pages) {
            // If page not already in memory
            if (!frames.contains(page)) {
                // If memory is full, remove the oldest page
                if (frames.size() == capacity) {
                    frames.poll(); // removes oldest
                }
                // Add the new page
                frames.add(page);
                pageFaults++;
            }
        }
        return pageFaults;
    }

    public static void main(String[] args) {
        int[] pages = {1, 2,3,1,4};
        int capacity = 3;

        int faults = FIFO_Page_Replacement(pages, capacity);
        System.out.println("Total Page Faults: " + faults);
    }
}
