package Array_practices;

///INCOMPLETE:
public class sumEqualTarget {
    public static  void twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if((nums[i]+nums[i+1])==target){
                System.out.println(nums[i]);
                System.out.println(nums[i+1]);
            }
            // 
        }
        
    }
   public static void main(String[] args) {
    int[] arr={2,7,9,4,6,7,7,4};
    int Target=9;
twoSum(arr, Target);
    // for(int i:arr){
    //     System.out.println(" "+i);
    // }
} 
}
