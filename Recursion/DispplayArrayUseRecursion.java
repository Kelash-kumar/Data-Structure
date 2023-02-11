package Recursion;

public class DispplayArrayUseRecursion {
    

    public static int DisplayArrayUseRecursion(int[] arr,int size){

        if(size==arr.length)return -1;

        return arr[size-1];
    }

    public static void main(String[] args) {
        int arr[] ={12,32,54,9,89,75,5432,12};
        System.out.println(DisplayArrayUseRecursion(arr, arr.length));
    }
}
