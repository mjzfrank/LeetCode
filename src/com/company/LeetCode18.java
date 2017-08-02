package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by wulvge on 2017/8/2.
 */
//  4Sum    4个数相加 = target
public class LeetCode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;
        Arrays.sort(nums);
        HashSet<List<Integer>> hs = new HashSet<>();
        for (int begin = 0; begin + 3 < nums.length; begin++) {
            for (int one = begin + 1; one + 2 < nums.length; one++) {
                if (one > one + 1 && nums[one - 1] == nums[one]) {
                    continue;
                }
                int l = one + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = nums[begin] + nums[one] + nums[l] + nums[r];
                    if (sum == target) {
                        List<Integer> intList = new ArrayList<>();
                        intList.add(nums[begin]);
                        intList.add(nums[one]);
                        intList.add(nums[l]);
                        intList.add(nums[r]);
                        if (!hs.contains(intList)) {
                            result.add(intList);
                            hs.add(intList);
                        }
                        l++;
                        r--;
                    } else if (sum>target){
                        r--;
                    }else {
                        l++;
                    }
                }
            }
        }
        return result;
    }


//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        int length = nums.length;
//        int pre_i = Integer.MAX_VALUE;
//        for(int i = 0; i < length - 3; i++){
//            if(pre_i == nums[i]){
//                continue;
//            }
//            pre_i = nums[i];
//            if (4 * nums[i] > target) {
//                break;
//            }
//            if(nums[i] + 3*nums[i+1] > target || nums[i] + 3*nums[length-1] < target){
//                continue;
//            }
//            for(int j = i+1; j < length - 2; j++){
//                if(j > i+1 && nums[j-1]==nums[j]){
//                    continue;
//                }
//                int m = j + 1;
//                int n = length-1;
//                int sub_target = target-nums[i]-nums[j];
//                while(m < n){
//                    if(nums[m] + nums[n] == sub_target){
//                        Integer[] temp = {nums[i],nums[j],nums[m],nums[n]};
//                        result.add(Arrays.asList(temp));
//                        while(++m < n && nums[m] == nums[m-1]);
//                        while(m < --n && nums[n] == nums[n+1]);
//                    }
//                    else if(nums[m] + nums[n] < sub_target){
//                        while(++m < n && nums[m] == nums[m-1]);
//                    }else{
//                        while(m < --n && nums[n] == nums[n+1]);
//                    }
//                }
//            }
//        }
//        return result;
//    }
}
