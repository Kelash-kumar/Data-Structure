package Array_practices;

public class sumOfSubarray {
    /**
     * CALCULATE THE SUM OF ALL SUB ARRAYS IN A ARRAY ;
     */
    public static void sumOfSubarray(int[] arr){
int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
               for(int j=i;j<arr.length;j++){
sum+=arr[j];
System.out.println(sum);
   }
   System.out.println(" ");
}

    }
    public static void main(String[] args) {
        

        int[] arr={1,2,0,7,2};
sumOfSubarray(arr);
    }
}
