public static int reverseInt(int number){
        String str = new StringBuilder(Math.abs(number)+"").reverse().toString();
        try {
            int result = Integer.parseInt(str);
            if (number>0) {
                return result;
            }else {
                return -result;
            }
        }catch (Exception e){
            return 0;
        }
    }