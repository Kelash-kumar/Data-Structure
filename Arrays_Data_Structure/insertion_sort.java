package Arrays_Data_Structure;

public class insertion_sort {

public static void  insertionSort(int arr[]){
    int n = arr.length;
    for (int i = 1; i < n; i++) { // Start from 1 as arr[0] is always sorted
      int currentElement = arr[i];
      int j = i - 1;
      // Move elements of arr[0..i-1], that are greater than value, 
      // to one position ahead of their current position 
      while (j >= 0 && arr[j] > currentElement) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
                         // Finally place the Current element at its correct position.
      arr[j + 1] = currentElement;
    }
  }
    public static void main(String[] args) {
        //insertion sort in array :
int[] arr={12,3,34,56,67,78,8,5};
// int n=arr.length;
System.out.println("Before sorting ");
for(int i:arr){
    System.out.print(i+" ");
}
insertionSort(arr);

System.out.println("\n After sorting ");
for(int i:arr){
    System.out.print(i+" ");
}


    }
    
}
