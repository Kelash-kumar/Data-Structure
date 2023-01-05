package Array_practices;

import java.util.Random;

public class arrays_practice {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(5, 50);
        for (int i : arr) {
            System.out.print( " "+i);
        }

    }

}
