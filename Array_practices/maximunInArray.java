package Array_practices;

public class maximunInArray {
    public static void main(String[] args) {
//completed:
        // finding greatest element in the array ;
        int[] arr = { 260, 23, 3, 4, 234, 235, 35, 6, 7, 8, 5, -99 };
        int max = arr[0];
        int min=arr[0];
        //    condition for greatest element;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                
                max = arr[i];
            }
        }

        //    condition for lowest  element;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                
                min = arr[i];
            }
        }

        System.out.println("The maximum nuber in the array "+max);
        System.out.println("The manimum nuber in the array "+min);
    }
}
