 //爬楼梯，只有爬一步和两步，爬上某一高度可以有多少种方式
    public static int climbStairs(int n) {
        int one = 1;
        int two = 2;
        int sum = 0;
        for (int i =0;i<=n;i++){
            for (int j=0;j<=n;j++){
                if (one*i+two*j == n){
                    sum++;
                }
            }
        }
        return sum;
    }