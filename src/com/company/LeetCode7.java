package com.company;

/**
 * Created by wulvge on 2017/7/27.
 */
// Int 倒数   int x = 1569;
public class LeetCode7 {
    public int reverse(int x) {
        long result = 0;
        //判断正负
        int zfsign = 1;
        if(x < 0 ){
            x = -x;
            zfsign =-1;
        }
        while (x!=0){
            result = result*10 + x%10;
            if(zfsign * result > Integer.MAX_VALUE || zfsign * result < Integer.MIN_VALUE)
                return 0;
            x=x/10;
        }
        return (int)result * zfsign;
    }
}
