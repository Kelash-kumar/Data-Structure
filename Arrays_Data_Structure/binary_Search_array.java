package Arrays_Data_Structure;

import java.util.Scanner;

public class binary_Search_array {
    
        public static int binarySearch(int[] arr,int n,int element){
int startposition=0;
int endposition=n;

int midposition=(startposition+endposition)/2;
while(startposition<=endposition){
if(midposition==element){
return midposition;
}
else if(arr[midposition]<element){
    startposition=midposition+1;
}
else{
    endposition=midposition-1;
}
}
return -1;

    }
    public static void main(String[] args) {
        /**Binary search is better than the linear search in term of Time complexity of 
         * a program like we divide the code into to half parts to search the specific entered
         * element in the array ;
         */

         int[] arr={23,4,56,7,8,98,76,6,9};
         int n=arr.length;
         Scanner sc=new Scanner(System.in);
         for(int i:arr){
            System.out.print(i+" ");
         }
         System.out.println("\n Enter element you want to search ");
         int element=sc.nextInt();

        System.out.println(binarySearch(arr, n, element));
        
        
        
        }
    
}
