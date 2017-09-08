/**
     * 移除数组中重复的元素，返回最新的长度
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        Set hashSet = new HashSet<>();
        for (int num: nums){
            hashSet.add(num);

        }
        return hashSet.size();
    }