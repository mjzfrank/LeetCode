package com.company;

/**
 * Created by wulvge on 2017/7/27.
 */
//是否回文     int x = 12321;
public class LeetCode9 {
    public boolean isPalindrome(int x) {
        double xd = x;
        double rxd = 0;
        //正负数
        int sign = 1;
        if(xd<0){
            sign = -1;
            xd = -xd;
        }
        while (x >=1){
            rxd = rxd * 10 + x % 10;
            x /= 10;
        }
        rxd *=sign;
        if(xd == rxd){
            return true;
        }else {
            return false;
        }
    }
}
