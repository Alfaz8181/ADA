import java.util.Arrays;
public class MergeSort {
 public static void mergeSort(int[] arr) {
 if (arr.length <= 1) return;
 int mid = arr.length / 2;
 int[] left = Arrays.copyOfRange(arr, 0, mid);
 int[] right = Arrays.copyOfRange(arr, mid,
arr.length);
 mergeSort(left);
 mergeSort(right);
 merge(arr, left, right);
 }
 private static void merge(int[] arr, int[] left, int[]
right) {
 int i = 0, j = 0, k = 0;
 while (i < left.length && j < right.length) {
 if (left[i] < right[j]) arr[k++] = left[i++];
 else arr[k++] = right[j++];
 }
 while (i < left.length) arr[k++] = left[i++];
 while (j < right.length) arr[k++] = right[j++];
 }
 public static void main(String[] args) {
 int[] arr = {6, 3, 8, 5, 2};
 mergeSort(arr);
 System.out.println(Arrays.toString(arr));

 }
}