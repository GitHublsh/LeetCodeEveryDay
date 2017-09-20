//两个数组排序
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        nums1 = Arrays.copyOf(nums1, m+n);//数组扩容
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        for (int i:nums1){
            System.out.println("result:"+i);
        }
    }