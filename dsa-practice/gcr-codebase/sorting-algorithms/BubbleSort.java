public class BubbleSort{
    
    // Method for bubble sorting
    static void bubbleSort(int arr[]){
        int len = arr.length;
        if(len<=1){
            return;
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Method to print array
    static void printArray(int arr[]){
        System.out.print("\nSorted array : ");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    
    public static void main(String[] args){
        int[] marks = {95,94,91,83,82};

        bubbleSort(marks);
        printArray(marks);
    }
}