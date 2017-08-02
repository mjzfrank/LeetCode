package com.company;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by wulvge on 2017/7/27.
 */

public class LeetCode3 {
    //Longest Substring Without Repeating Characters  最长的没有重复字母的String
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        HashSet<Character> set = new HashSet<Character>();
        int max = 0;
        int walker = 0;
        int runner = 0;
        while (runner < s.length()) {
            if (set.contains(s.charAt(runner))) {
                if (max < runner - walker) {
                    max = runner - walker;
                }
                while (s.charAt(walker) != s.charAt(runner)) {
                    set.remove(s.charAt(walker));
                    //我觉得这句话没有啥作用,因为他并没有正确的保存不重复的字符串，
                    walker++;
                }
                walker++;
            } else {
                set.add(s.charAt(runner));
            }
            runner++;
        }


        for (Character character : set) {
            System.out.println(">>>>>>>>>>>>"+character);
        }
        max = Math.max(max, runner - walker);
        return max;
    }
    //Longest Substring Without Repeating Characters
    public int lengthOfLongestSubstring2(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        int [] countTable = new int[256];
        Arrays.fill(countTable, -1);
        int max = 1;
        int start = 0;
        int end = 1;

        countTable[s.charAt(0)] = 0;
        while (end < length) {
            //Has not reached a duplicate char
            if (countTable[s.charAt(end)] >= start) {
                start = countTable[s.charAt(end)] + 1;
            }
            max = Math.max(max, end - start + 1);
            countTable[s.charAt(end)] = end;
            end++;
        }
        System.out.print(max);
        return max;
    }
}
