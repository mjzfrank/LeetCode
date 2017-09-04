package com.company;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by wulvge on 2017/8/2.
 */
// Remove Duplicates from Sorted Array
public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int dup = nums[0];
        int end = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=dup){
                nums[end] = nums[i];
                dup = nums[i];
                end++;
            }
        }
        return end;
    }
}
