public class SelectionSort {
    
    // Method for selection sort
    static void selectionSort(int arr[]){

        // Print unsorted array
        System.out.print("Your array is : ");
        for(int i : arr){
            System.out.print(i +" ");
        }

        // Sort the array
        int len = arr.length;
        for(int i=0;i<len;i++){
            int min = i;
            for(int j=i;j<len;j++){
                if(arr[min]>arr[j]){
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("\nYour sorted array is : ");
        for(int i : arr){
            System.out.print(i +" ");
        }
    }


    public static void main(String[] args) {
        
        int scores[] = {83,62,78,91,89,88};
        selectionSort(scores);
    }
}
