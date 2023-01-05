package Array_practices;

import java.util.Random;

public class copyArray {

    public static int[] resizeArray(int[] array1, int n) {
        if (n < array1.length)
            throw new IllegalArgumentException();
        int[] newarray = new int[n]; // access new array whose size is greater then the old ;
        System.arraycopy(array1, 0, newarray, 0, array1.length); // copy old array to new one;
        return newarray;
    }

    public static int repeationOfElementInArray(int[] a, int value) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == value)
                count++;

        }
        return count;
    }

    public static void display(int[] a) {
        for (int i : a)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(2, 20);
        }
        display(arr);
        System.out.println("----------------------");
        System.out.println(repeationOfElementInArray(arr, 12));
        System.out.println(resizeArray(arr, 20));
    }
}
