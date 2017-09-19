 //二进制加法，最终结果显示二进制
    public static String addBinary(String a, String b) {
        int sum = 0;
        sum = Integer.parseInt(a,2)+Integer.parseInt(b,2);
        return Integer.toBinaryString(sum);
    }