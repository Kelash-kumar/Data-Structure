package Arrays_Data_Structure;
/**
 * Suppose, you were given an integer array [1, 2, 3, 4, 5, 6, 7, 8] and asked to rotate left by 4 and then rotate right by 4. 
 * Write a program to accomplish array rotation by left and right.

input: [1, 2, 3, 4, 5, 6, 7, 8]

first output: [5, 6, 7, 8, 1, 2, 3, 4]

 */
public class RotateArray {
    public static void RotateArrayLeft(int[] arr, int size, int numberOfRotation) {
        for (int i = 0; i < numberOfRotation; i++) { // take out the first element int temp = arr[0];
            int temp = arr[0];
            for (int j = 0; j < size - 1; j++) { // shift array elements towards left by 1 place arr[j] = arr[j +
                                                 // 1]; } arr[length - 1] = temp; }
                arr[j] = arr[j + 1];
            }
            arr[size - 1] = temp;
        }

    }

    

    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 26, 8, 7, 20 };
        int size = arr.length;
        RotateArrayLeft(arr, size, 4);
        display(arr);
    }
}
