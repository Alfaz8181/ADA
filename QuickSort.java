public class QuickSort {
    public static void quickSort(int[] arr, int low, int high)
   {
    if (low < high) {
    int pivotIndex = partition(arr, low, high);
    quickSort(arr, low, pivotIndex - 1);
    quickSort(arr, pivotIndex + 1, high);
    }
    }
    public static int partition(int[] arr, int low, int high)
   {
    int pivot = arr[high]; 
    int i = low - 1; 
    for (int j = low; j < high; j++) {
    if (arr[j] <= pivot) { 
    i++;
    swap(arr, i, j);
    }
    }
    swap(arr, i + 1, high); 
    return i + 1; 
    }
    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
    public static void main(String[] args) {
    int[] arr = { 10, 7, 8, 9, 1, 5 };
    int n = arr.length;
    System.out.println("Unsorted Array:");
    printArray(arr);
    quickSort(arr, 0, n - 1);
    System.out.println("Sorted Array:");
    printArray(arr);
    }
    public static void printArray(int[] arr) {
    for (int num : arr) {
    System.out.print(num + " ");
    }
    System.out.println();
    }
   } 
   

   