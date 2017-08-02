package com.company;

/**
 * Created by wulvge on 2017/7/27.
 */
//String 转 int
public class LeetCode8 {
    public int myAtoi(String str) {
        if (str == null || "".equals(str)) return 0;
        int i=0;
        str = str.trim();
        int length=str.length();//获得字符串长度
        //正负号判断
        int sign = 1;
        if(str.charAt(i) =='+'){
            i++;
        }else if(str.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        double result = 0;
        while (i<str.length() && str.length()>=1 && str.charAt(i)>='0' && str.charAt(i)<='9'){
            result = result *10 + (str.charAt(i) - '0');
            if(result*sign > Integer.MAX_VALUE && result < Integer.MIN_VALUE){
                return 0;
            }
            i++;
        }
        return (int) (result * sign);
    }
}
