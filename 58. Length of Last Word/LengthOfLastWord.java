 //字符串中最后一个单词的长度
    public static int lengthOfLastWord(String s) {
        if (s.contains(" ")&& s.length()>1){
            String[] strs = s.split(" ");
            if (strs.length>0) {
                return strs[strs.length - 1].length();
            }else {
                return s.length();
            }
        }
        return 0;
    }