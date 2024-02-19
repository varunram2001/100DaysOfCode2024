class Solution {
  public int[] sortedSquares(int[] nums) {
      int arr[]=new int[nums.length];
      for(int i=0;i<nums.length;i++)
      {
          nums[i]=nums[i]*nums[i];
      }
      int head=0;
      int tail=nums.length-1;
      for(int pos=nums.length-1;pos>=0;pos--)
      {
          if(nums[head]>nums[tail])
          {
             arr[pos]=nums[head];
             head++;
          }
          else
          {
              arr[pos]=nums[tail];
              tail--;
          }
          

      }
      return arr;
    
  }
}