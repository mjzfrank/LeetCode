package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wulvge on 2017/8/2.
 */
//Letter Combinations of a Phone Number String digits = "245"; 电话号码对应英文可能性
public class LeetCode17 {
    public List<String> letterCombinations(String digits) {
        List<String> result =new ArrayList<>();
        if(digits == null || digits.length()==0){
            return result;
        }
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int[] number = new int[digits.length()];    //存储digits中每个字符在循环中的编号，初始为0

        int k = digits.length()-1;
        while(k>=0) {
            k = digits.length()-1;
            char[] charTemp = new char[digits.length()];
            for(int i=0; i<digits.length(); i++) {
                charTemp[i] = map[digits.charAt(i)-'0'].charAt(number[i]);
            }
            result.add(new String(charTemp));
            while(k>=0) {
                if( number[k] < (map[digits.charAt(k)-'0'].length()-1) ) {
                    number[k]++;
                    break;
                } else {
                    number[k] = 0;
                    k--;
                }
            }
        }

        return result;
    }
}
