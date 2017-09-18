public static int maxSubArray(int[] nums) {
        int sum = 0;
        if (nums.length>1) {
            Arrays.sort(nums);
            sum = nums[nums.length-1]+nums[nums.length-2];
        }
        return sum;
    }