package com.company;

import java.util.Arrays;

/**
 * Created by wulvge on 2017/8/3.
 */
//Remove Element
public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int num=0,i;
        for(i=0;i<nums.length;++i){
            if (nums[i] != val)
                nums[num++] = nums[i];
        }
        return num;
    }
}
