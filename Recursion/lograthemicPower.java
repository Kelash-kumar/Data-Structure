package Recursion;


public class lograthemicPower {

public static double powerLograthemicFunction(int base,int power){
     if(power==0)return 1;
    
    double answer= powerLograthemicFunction(base, power/2);
 double ans=answer*answer;
    if(power%2!=0){
        ans*=base;
        return ans;
    }
    return ans;
}

    public static void main(String[] args) {
    System.out.println(powerLograthemicFunction(2, 6));
}    
}
