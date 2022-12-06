package Arrays_Data_Structure;

import java.util.Scanner;

public class searching_operation_array {
    public static int searchArray(int arr[], int key){
     for(int i=0;i<arr.length;i++){
      if(arr[i]==key){
        return i;
      }
     }
     return -1;
    }
public static void main(String[] args) {
    // 4- Searching operation in arrays
    //This is our linear search whose time complexity if O(n) ; 
    Scanner sc=new Scanner(System.in);
    int[] arr={34,5,76,8,9,7,46,9,8,6,36};
    for(int i:arr){
        System.out.print(i+" ");
    }
    System.out.print("\n Enter which element you wants to search " );
    int key=sc.nextInt();
    System.out.print("you searched element is at index = ");
   System.out.println( searchArray(arr, key));
}    
}
