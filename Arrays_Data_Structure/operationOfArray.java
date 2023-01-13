package Arrays_Data_Structure;

public class operationOfArray {
    int sizeofArray;
    int[] array;

    operationOfArray(int[] arr) {
        this.sizeofArray = arr.length + 1;
        this.array = new int[arr.length + 1];
    }

    public void traverseArray(int[] arr) {
        int j = 0;
        while (j < arr.length) {
            array[j] = arr[j];
            j++;
        }

        for (int i = 0; i < array.length; i++) {
            if (i == sizeofArray - 1) {
                if (array[sizeofArray - 1] == 0)
                    break;

            }
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        operationOfArray o = new operationOfArray(arr);
        o.traverseArray(arr);

    }
}
