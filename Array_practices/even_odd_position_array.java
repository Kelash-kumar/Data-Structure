package Array_practices;

public class even_odd_position_array {
//COMPLETED;
    /**  question :
     * WRITE A PROGRAM TO PRINT ARRAY HAVING EVEN POSITION ELEMETS ARE GREATER THEN THE 
     * ODD POSITION ELEMENTS ;
     * EXAMPLE: 
     * INPUT:  [1, 9, 2, 8, 3, 7, 4, 6, 5, 10]
     * OUTPUT: 1 9 2 8 3 7 4 6 5 10
     * 
     * @param arr
     */
    public static void evenGreaterOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(" " + i);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 9, 2, 8, 3, 7, 4, 6, 5, 10 };
        evenGreaterOdd(arr);
    }
}
