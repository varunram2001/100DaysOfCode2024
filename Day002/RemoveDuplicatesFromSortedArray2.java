class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int i=0;
        for(int n:nums)
        {
            if(i<2 || n!=nums[i-2])
            {
                nums[i++]=n;
            }

        }
        return i;
    }
}