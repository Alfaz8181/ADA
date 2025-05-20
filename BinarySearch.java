public class BinarySearch {
    public static int search(int[] arr, int target, int low,
   int high) {
    if (low > high) return -1;
    int mid = (low + high) / 2;
    if (arr[mid] == target) return mid;
    else if (arr[mid] < target) return search(arr, target,
   mid + 1, high);
    else return search(arr, target, low, mid - 1);
    }
    public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9};
    System.out.println(search(arr, 5, 0, arr.length - 1));
   
    }
   }
   