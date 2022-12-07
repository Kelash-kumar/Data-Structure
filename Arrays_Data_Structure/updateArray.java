package Arrays_Data_Structure;

import java.util.Scanner;

public class updateArray {
   public static void main(String[] args) {
    
//i want to update any value of the array :
Scanner sc=new Scanner(System.in);
    int[] arr={2,3,4,54,56,7,8,9,78};
    System.out.println("which value you want to update ");
    int oldVAlue=sc.nextInt();
    System.out.println("what value you want to put instead of this. ");
    int newValue=sc.nextInt();

    for(int i=0;i<arr.length;i++){
        if(arr[i]==oldVAlue){
            arr[i]=newValue;
            break;
        }
    }
System.out.println("your updated array is :");
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
   } 
}
