package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wulvge on 2017/7/27.
 */
//ZigZag Conversion  String Z型
public class LeetCode6 {
    public String convert(String s, int numRows) {
        String[] rowStrings = new String[numRows];
        if (numRows <= 1 || numRows >= s.length()) {
            return s;
        }
        int rowNum = 1;
        //第一行向下写  最后一行向上写
//        PAYPALISHIRING
//        P   A   H   N
//        A P L S I I G
//        Y   I   R
        int flag = 1;
        for(int i = 0; i < s.length(); i++) {
            String thisChar = s.substring(i,i+1);
            rowStrings[rowNum - 1] = rowStrings[rowNum - 1] == null ? "" : rowStrings[rowNum - 1];
            rowStrings[rowNum-1] += thisChar;
            if(rowNum == numRows){
                flag = -1;
            }
            if(rowNum == 1){
                flag = 1;
            }
             rowNum += flag;
        }
        String result ="";
        for ( int i = 0;i<numRows;i++){
            result +=rowStrings[i];
        }
        return result;
    }
}
