package Leetcode;

public class YanseSort {
    public void InsertSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int end = i;
            int tem = nums[end+1];
            while(end>=0){
                if(nums[end]>tem){
                    nums[end+1] = nums[end];
                    --end;
                } else{
                    break;
                }
            }
            nums[end+1] = tem;
        }
    }
}