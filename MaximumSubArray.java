class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        /*
         * TC: O(n) for running sum
         * SC: O(1)
         *
         */
        // base case
        if (nums.length == 0 || nums == null) return 0;
        
        // logic - rsum
        int rSum = nums[0];
        int max = nums[0];
        
        for (int i=0; i<nums.length - 1; i++) {
            rSum = Math.max(rSum + nums[i+1], nums[i+1]);
            max =  Math.max(max, rSum);
        }
        
        return max;
    }
}
