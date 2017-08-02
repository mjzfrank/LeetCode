package com.company;

import java.util.Arrays;

/**
 * Created by wulvge on 2017/7/28.
 */
//3Sum Closest   找出3个数字相加最接近target的数      int[] nums = new int[]{1,-1,-2,-5,1,3}; int target = 3;
public class LeetCode16 {
//    public int threeSumClosest(int[] nums, int target) {
//        int result = 0;
//        if (nums == null || nums.length < 3) {
//            return result;
//        }
//        int a,b,c;
//        Arrays.sort(nums);
//        int cloest = 0; //与target的插
//        for (int i = 0; i + 2 < nums.length; i++) {
//            int z = i + 1;
//            int y = nums.length - 1;
//            while (z < y) {
//                a = nums[i];b= nums[z];c=nums[y];
//                int sum = nums[i] + nums[z] + nums[y];
//                if (i == 0 && z == 1 && y == nums.length - 1) {
//                    result = sum;
//                    cloest = Math.abs(target - sum);
//                    z++;
//                } else {
//                    if (cloest > Math.abs(target - sum)) {
//                        cloest = Math.abs(target - sum);
//                        result = sum;
//                        y--;
//                    }else {
//                        z++;
//                    }
//                }
//                if(nums[z] == nums[z+1]){
//                    z++;
//                }
//                if(nums[y] == nums[y-1]){
//                    y--;
//                }
//            }
//        }
//        return result;
//    }

    public int threeSumClosest(int[] num, int target) {
        //先排序，再遍历。
        int ans =0;
        int sum;
        int ArrySize = num.length;
        //需要加上作用域Array才能调用其内的方法
        Arrays.sort(num);
        //ans初始化很重要 影响后面比较
        ans = num[0] + num[1] + num[2];

        //遍历
        for(int i = 0; i < ArrySize - 2; i++)
        {
            int j = i + 1;      //i后面的数
            int k = ArrySize - 1;       //倒着数

            while(j < k)
            {
                sum = num[i] + num[j] + num[k];

                if( Math.abs(target - ans) > Math.abs(target - sum))           //当前更小
                {
                    ans = sum;
                    //如果距离为0  直接返回ans
                    if(ans == target)
                        return ans;
                }
                //条件运算符把冒号两边之一作为返回值，所以必须是值，不能是语句
                //(sum > target) ? k-- : j++; (sum > target) ? （k -= 1） : （j += 1）;  ERROR!!
                // (sum > target) ? （k -= 1） : （j += 1）;
                if(sum > target)          //大了，倒着的数减小
                    k--;
                else
                    j++;
            }
        }

        //遍历后计算出距离最近的ans
        return ans;
    }
}