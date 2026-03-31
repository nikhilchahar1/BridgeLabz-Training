public class InsertionSort{

    // Method to perform Insertion Sort
    public static void insertionSort(int[] employeeIds) {

        for (int i = 1; i < employeeIds.length; i++) {
            int currentId = employeeIds[i];
            int j = i - 1;

            while (j >= 0 && employeeIds[j] > currentId) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }
            employeeIds[j + 1] = currentId;
        }
    }

    public static void main(String[] args) {

        int[] employeeIds = {105,102,108,101,104};

        // Print the unsorted array
        System.out.println("Before Sorting:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }

        insertionSort(employeeIds);

        // Print the sorted array
        System.out.println("\n\nAfter Sorting:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}
