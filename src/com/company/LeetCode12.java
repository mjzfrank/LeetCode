package com.company;

/**
 * Created by wulvge on 2017/7/27.
 */
/*1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

1000~3000: {"M", "MM", "MMM"}.*/
//int转罗马
public class LeetCode12 {
    public String intToRoman(int num) {
        if(num<1 || num >3999) return "";
        String[][] roman = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };
        String romanResult = "";
        int digit = 0;
        while (num != 0) {
            int remain = num % 10;
            romanResult = roman[digit][remain] + romanResult;
            digit++;
            num /= 10;
        }
        return romanResult;
    }
}
