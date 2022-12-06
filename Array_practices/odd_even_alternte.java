package Array_practices;
//COMPLETED:
public class odd_even_alternte {
    public static void oddEvenAlternate(int[] arr) {
    for(int i=0;i<arr.length;i++){
    
    if(arr[i]<0 ){
        int temp=arr[i+1];
        arr[i+1]=arr[i];
        arr[i]=temp;
    }
    }

    for(int i:arr){
        System.out.print(" "+i);
    }
    }
    public static void main(String[] args) {
        int[] arr={-3,4,5,-5,3,7,-7,-5};
        oddEvenAlternate(arr);
    }
}
