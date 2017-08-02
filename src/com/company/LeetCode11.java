package com.company;

/**
 * Created by wulvge on 2017/7/27.
 *///Container With Most Water      找出水桶最大容积
public class LeetCode11 {
    public int maxArea(int[] height) {
        if (height.length < 2) return 0;
        int ans = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            int v = (r - l) * Math.min(height[l], height[r]);
            if (v > ans) ans = v;
            if (height[l] < height[r]) l++;
            else r--;
        }
        return ans;
    }
}
