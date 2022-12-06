package Arrays_Data_Structure;

import java.util.Scanner;

public class insertion_operation_2 {
public static void main(String[] args) {
    //Takinsg whole array element from the user wiht size;
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.println("Enter the size of array ");
    size=sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<arr.length;i++){
         System.out.print("Enter the value at arr["+i+"] : ");
        arr[i]=sc.nextInt();
    }


    System.out.println("Printing the user input array ");
    for(int i:arr){
        System.out.print(i+" ");
    }
}    
}
