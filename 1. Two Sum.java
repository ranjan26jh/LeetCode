/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int a[]=new int[2];
        for(int i=0; i<nums.length;i++){

            for(int j=1+i;  j<nums.length  ;j++){
                sum=nums[i]+nums[j];
                if(sum==target)
                {
                 a[0]=i;
                 a[1]=j;}
            }
          

        }
         
            return a;
        
    }
}
