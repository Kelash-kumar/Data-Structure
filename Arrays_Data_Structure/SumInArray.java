package Arrays_Data_Structure;

public class SumInArray {
    public static void main(String[] args) {
        int[] arr={23,234,243,234,423,234,2434,53,434,23,42,34};
    
    int sum=0;
    int size=arr.length;
    int middle=size/2;
    for(int i=0;i<arr.length;i++)
    {
sum+=arr[i];
    }
    System.out.println(sum);
    System.out.println("average is = "+sum/size);
    System.out.println("The middle is "+arr[middle]);
    System.out.println("The last is "+arr[size-1]);
    }
}
