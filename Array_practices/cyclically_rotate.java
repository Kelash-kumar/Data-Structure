package Array_practices;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/**QUESTION:
 * Given an array, cyclically rotate the array clockwise by one. 

Examples:  

Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
 */

 // RIGHT APPROACH TO SOLVE IT :
 /**
  * Following are steps. 
1) Store last element in a variable say x. 
2) Shift all elements one position ahead. 
3) Replace first element of array with x.
  */
public class cyclically_rotate {
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

        int[] arr={1,2,3,4,5};
        int x = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;
     
       for(int i:arr){
        System.out.print(i+" ");
       }
       System.out.println("Successfully done ");
       System.out.println();
    }
    

}
