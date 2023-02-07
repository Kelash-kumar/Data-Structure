package Recursion;

import javax.swing.text.rtf.RTFEditorKit;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class printDecreasing {

    public static void Print_Decreasing(int num) {
        if (num == 0)
            return;
        System.out.println(num);
        Print_Decreasing(num - 1);
    }

    public static void Print_Increasing(int num) {
        if (num == 0)
            return;

        Print_Increasing(num - 1);
        System.out.println(num);
    }

    public static void Print_DecreasingIncreasing(int num) {
        if (num == 0)
            return;

        System.out.println(num);
        Print_DecreasingIncreasing(num - 1);
        System.out.println(num);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static int  powerFunction(int x,int n){

        if(n==0)return 1 ;

        return x*powerFunction(x, n-1);
    }

    public static void main(String[] args) {
        // Print_Decreasing(5);
        // Print_Increasing(5);
        // Print_DecreasingIncreasing(5);
        // System.out.println(factorial(5));
        // powerFunction(5, 3);
        System.out.println(powerFunction(5, 3));
    }
}
