package Array_practices;

/**
 *   *C//
 * Given an array of elements of length N, ranging from 0 to N – 1. All elements
 * may not be present in the array.
 * If the element is not present then there will be -1 present in the array.
 * Rearrange the array such that A[i] = i and if i is not present, display -1 at
 * that place.
 * 
 * Examples:
 * 
 * Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
 * Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
 */
// sort by insertion sorting method :
public class missing_number {
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                arr[i] = -1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 5, 78, -1, -3, 9, 7 };
        System.out.println("Array before ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sortArray(arr);
        System.out.println("\n Array After ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
