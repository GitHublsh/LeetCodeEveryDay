 /**
     * 给定一个已排序的数组和一个值，查询给定值在数组中的位置
     * 如果查找到该给定值，返回index
     * 如果没有找到，则返回给定值可按序插入的index
     * @param nums 已排序的数组
     * @param target 目标值
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int begin = 0;
        for(int i = 0;i<nums.length;i++){
            if (target<=nums[i]){
                begin = i;
                break;
            }else {
                begin = i+1;
            }
        }
        return begin;
    }