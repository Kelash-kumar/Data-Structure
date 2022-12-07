package Arrays_Data_Structure;

import java.util.Scanner;

public class deletion_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 3, 4, 5, 6, 76, 7, 86, 45, 24, 332 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nEnter the element you wants to delete");
        // int pos=sc.nextInt();
        int n = arr.length;
        int k = 5;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                while (i < n -1) {
                    arr[i] = arr[i + 1];
                    i++;
                }
                n = n - 1;
            }
        }

        System.out.println();
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }

}