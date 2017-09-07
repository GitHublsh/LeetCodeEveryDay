
    /**
     * 判断一个整型数是否为回文
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        int temp = x;
        int sum = 0;
        while (temp>0) {
            sum = sum * 10 + temp % 10;
            temp /= 10;
        }
        if (sum == x) {
            return true;
        }
        return false;
    }