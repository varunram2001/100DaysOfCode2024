class NumArray {
    int[] prefixSum = null;
    // O(n)
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length+1];

        for(int i=0;i<nums.length;i++){
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
    }

    // O(1)
    public int sumRange(int left, int right) {
        return prefixSum[right+1] - prefixSum[left];
    }
}