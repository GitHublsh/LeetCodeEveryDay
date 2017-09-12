/**
     * 给定一个数组和一个值，删除该值的所有实例，并返回新的长度。
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int sum = 0;
        for (int i= 0;i<nums.length;i++){
            if (nums[i] == val){
                sum++;
            }
        }
        return nums.length - sum;
    }