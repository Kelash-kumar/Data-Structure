package Array_practices;

public class classTest {

    public static void main(String[] args) {
        int[] arr={15,16,17};

        int size=arr.length;
        int[] newarr=new int[size*3];
        int k=1;
        int j=0;
        while (k<=3){
            for(int i=0;i<arr.length;i++){
               newarr[j]=arr[i];
               j++;
            }
            k++;
        }


        for(int i:newarr)System.out.print(i+" ");
    }
}
