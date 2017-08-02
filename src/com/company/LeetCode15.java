package com.company;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by wulvge on 2017/7/28.
 */
//3Sum == 0    3个数相加为0    int[] nums = new int[]{1,-1,-2,-5,1,3};
public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> IntegerResult = new ArrayList<>();
        if (nums == null || nums.length < 3) return IntegerResult;
        Arrays.sort(nums); //排序
        HashSet<List<Integer>> hs = new HashSet<>();
        for (int i = 0; i + 2 < nums.length; i++) {
            int l = i+1;
            int r = nums.length -1;
            while (l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> integerList = new ArrayList<>();
                    integerList.add(nums[i]);
                    integerList.add(nums[l]);
                    integerList.add(nums[r]);
                    if (!hs.contains(integerList)) {
                        IntegerResult.add(integerList);
                        hs.add(integerList);
                    }
                    l++;
                    r--;
                }else if(sum >0 ){
                    r--;
                }else {
                    l++;
                }
            }
        }
        return IntegerResult;
    }

//    public List<List<Integer>> threeSum(int[] num) {
//        List<List<Integer>> res  = new ArrayList<>();
//        if(num.length<3||num == null)
//            return res;
//        Arrays.sort(num);
//        for(int i = 0; i <= num.length-3; i++){
//            if(i==0||num[i]!=num[i-1]){//remove dupicate
//                int low = i+1;
//                int high = num.length-1;
//                while(low<high){
//                    int sum = num[i]+num[low]+num[high];
//                    if(sum == 0){
//                        ArrayList<Integer> unit = new ArrayList<Integer>();
//                        unit.add(num[i]);
//                        unit.add(num[low]);
//                        unit.add(num[high]);
//
//                        res.add(unit);
//
//                        low++;
//                        high--;
//
//                        while(low<high&&num[low]==num[low-1])//remove dupicate
//                            low++;
//                        while(low<high&&num[high]==num[high+1])//remove dupicate
//                            high--;
//
//                    }else if(sum > 0)
//                        high --;
//                    else
//                        low ++;
//                }
//            }
//        }
//        return res;
//    }
}
