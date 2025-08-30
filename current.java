

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

