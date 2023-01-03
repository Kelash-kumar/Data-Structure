package Arrays_Data_Structure;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2dArray_2 {

    static int binarySearch(int[] a, int x) {
        int p = 0, q = a.length - 1;
        while (p <= q) {
            int i = (p + q) / 2;
            if (a[i] == x)
                return i;
            else if (a[i] < x)
                p = i + 1;
            else
                q = i - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[][] = new int[][] { { 11, 23, 34 }, { 44, 5, 6 }, { 27, 84, 69 }, { 10, 161, 132 }, { 173, 148, 154 },
                { 136, 175, 188 }, { 193, 205, 216 }, { 282, 233, 224 }, { 256, 267, 287 }, { 284, 293, 302 } };

        Scanner sc = new Scanner(System.in);

        int[] newarr = new int[30];
        int count = 0;
        // contverting to single dimen arr;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                newarr[count] = arr[j][i];
                count++;
            }
        }

        System.out.println("Array Before Sort ");
        for (int i : newarr) {
            System.out.print(i + " ");
        }
        // sorting the array;
        Arrays.sort(newarr);
        System.out.println();
        System.out.println("Array After Sort ");
        for (int i : newarr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n\nFinding target: \n");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter target " + (i + 1) + " :");
            int x = sc.nextInt();
            int index = binarySearch(newarr, x);
            if (index < 0)
                System.out.println("Sorry! Target does not found");
            else
                System.out.println("Target found at index: " + index);
        }
    }

}
