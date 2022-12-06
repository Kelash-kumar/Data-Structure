package Arrays_Data_Structure;

public class tranversal_operation {
    public static void main(String[] args) {
        // 1- tranversal operation on arrays
        System.out.println("Starting with arrays ");
        int[] arr = { 1, 2, 3, 4, 5, 55, 6, 6 };

        // Method :01;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);

        // method 02;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
