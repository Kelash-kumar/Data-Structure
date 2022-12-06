package Arrays_Data_Structure;

public class insert_operation_1 {
    
public static void main(String[] args) {
     //insertion operation ;
     int[] arr={5,6,7,8,0,6,4,7,8,5};
   
     System.out.println("Array before insertion ");
     for(int i:arr){
        System.out.print(i+" ");
     }

       // to add an element at particular index 5;
       int element=20;
       arr[5]=element;

     System.out.println("\nArray after insertion ");
     for(int i:arr){
        System.out.print(i+" ");
     }
     
}
}
