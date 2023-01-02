package Array_practices;

import Linked_List.linkedList;

public class TwoSum {

    
    public  int[] twoSum(int[] nums, int target) {
        int[] news= new int[2];
         for(int i=0;i<nums.length;i++){
             int search=target-nums[i];
             for(int j=i;j<nums.length;j++){
                 if(nums[j]==search){
                    news[0]=nums[i];
                    news[1]=nums[j];
                    System.out.println(news[0]+" "+news[1]);
                    return news;
                 }
             }
    
            }
        return news;
    }
    
 public static void main(String[] args) {
    TwoSum t=new TwoSum();

    int[] arr={22,4,3,5,16,7,8};
    
System.out.println(t.twoSum(arr, 9));




 }   
}
