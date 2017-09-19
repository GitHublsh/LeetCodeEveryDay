//实现sqrt,计算x的平方根
    public static int mySqrt(int x) {
        float min = 0;
        float max = x;
        float mid = (max + 1) / 2;
        while (mid * mid != x) {
            if (mid * mid > x) {
                max = mid;
                mid = (max + min) / 2;
            }
            if (mid * mid < x) {
                min = mid;
                mid = (max + min) / 2;
            }
        }
        System.out.print(mid + "");
        return (int) mid;
    }