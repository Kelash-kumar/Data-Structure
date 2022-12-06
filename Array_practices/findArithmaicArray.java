package Array_practices;

public class findArithmaicArray {
    //not complete
    public static void ArthematicArray(int[] arr){
        String arry="";
    //  for(int i=1;i<arr.length;i++){
    //      int currentElement=arr[i];
    //      int j=i-1;
    //      int diff=currentElement-arr[j];
    //      if(arr[j+1]-arr[j]==2){
    //         // System.out.println("Arthemaic");
    //      }
         
    for(int i=1;i<arr.length;i++){
        
        for(int j=(i-1);j<arr.length;j++){
            int current=arr[i];
            int diff=current-arr[j];
            if(arr[j+1]-arr[j]==diff){
                arry=Integer.toString(arr[j]);
            }
        }
        System.out.println();
    }

    System.out.println(arry);
}

    public static void main(String[] args) {
        int[] arr={1,8,3,9,7,5,3,8,6,9,10};
ArthematicArray(arr);
    }
}
