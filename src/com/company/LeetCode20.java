package com.company;

import java.util.Stack;

/**
 * Created by wulvge on 2017/8/2.
 */
// Valid Parentheses    必须是[] {} ()对应   String s = {[()]};
public class LeetCode20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
