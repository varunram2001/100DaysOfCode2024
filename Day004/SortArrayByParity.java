class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int pointer=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                arr[pointer++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                arr[pointer++]=nums[i];
            }
        }
return arr;
        
    }
}