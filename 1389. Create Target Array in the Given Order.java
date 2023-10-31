/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

 
*/
class Solution {
    public static void shiftArray(int[] target,int n){
        int i=target.length-1;
        while(i>=0 && target[i]!=-1){
            i--;
        }
        while(i!=n){
            target[i]=target[i-1];
            i--;
        }
    }
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        Arrays.fill(target,-1);
        for(int i=0;i<index.length;i++){
            if(target[index[i]]!=-1){
                shiftArray(target,index[i]);
                target[index[i]]=nums[i];
            }
            else{
                target[index[i]]=nums[i];
            }
        }
        return target;
    }
}
