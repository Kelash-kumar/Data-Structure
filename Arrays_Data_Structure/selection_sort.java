package Arrays_Data_Structure;

public class selection_sort {
    public static void main(String[] args) {
        //selection sort in java :
        /**
         * Find the minimum element in unsorted array and swap it with element,
         *  at begining.
         */

      
         int[] arr={122,3,5,5,34,8,87,54,9,43};
      //shifting each element to check using nested loop;
System.out.println("Array before linear sort \n");
for(int i:arr){
    System.out.print(i+" ");
}

//code of ascending order 
      for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                 if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                 }
            }
         }
         System.out.println("\nArray after linear sort (ascending)\n");
         for(int i:arr){
             System.out.print(i+" ");
         }
//code of descending order 
      for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                 if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                 }
            }
         }

         System.out.println("\nArray after linear sort (descending)\n");
         for(int i:arr){
             System.out.print(i+" ");
         }
    }
}
