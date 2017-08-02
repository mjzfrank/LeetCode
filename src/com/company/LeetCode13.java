package com.company;

/**
 * Created by wulvge on 2017/7/27.
 */
//罗马数字转int  String roman = "MXVI"
public class LeetCode13 {
    public  int romanToInt(String roman){
        int stack = 0;
        int lastInt = 0;
        for(int i =0;i<roman.length();i++){
            int thisInt = getIntFromRoman(roman.charAt(i));
            if (thisInt == 0){
                return 0;
            }
            if(thisInt>lastInt){//左减   //特殊情况 IV XL CD  CM
                stack = stack-(lastInt<<1);
            }
            stack = stack+thisInt;
            lastInt = thisInt;
        }
        return stack;
    }

    private int getIntFromRoman(char roman){//I(1)，V(5)，X(10)，L(50)，C(100)，D(500)，M(1000)。
        int a;
        switch (roman) {
            case 'I':
                a= 1;
                break;
            case 'V':
                a= 5;
                break;
            case 'X':
                a= 10;
                break;
            case 'L':
                a= 50;
                break;
            case 'C':
                a= 100;
                break;
            case 'D':
                a= 500;
                break;
            case 'M':
                a= 1000;
                break;
            default:
                a=0;
                break;
        }
        return a;
    }

}