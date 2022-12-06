package Arrays_Data_Structure;

import java.util.Scanner;

public class deletion_operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={3,4,5,6,76,7,86,45,24,332};
        for(int i:arr){
            System.out.print(i+" ");
    }
        System.out.println("\nEnter the element you wants to delete");
        int pos=sc.nextInt();
        int a=arr.length;
        for(int i=pos;i<a;i++){
            arr[i]=arr[i+1];

        }
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
    }
}

}