package com.mozss.basic.algorithms.leetcode.binary;

/**
 * @author mozss
 * @create 2019-09-05 23:49
 */

public class No367 {
    /*
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目名称:   367.有效的完全平方数
     * 知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述:   给定一个正整数,编写一个函数,如果num是一个完全平方数,则返回True,否则放回False
     *             说明: 不要使用任何内置的库函数
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * 输入Input:    16
     * 输出Output:   true
     * 说明:
     *
     * eg 2>:
     * 输入Input:    14
     * 输出Output:   false
     * 说明:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:
     * 题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
    
    public boolean isPerfectSquare(int num) {
        int l = 0;
        int r = num;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            //反向算，防止乘法溢出
            if (mid == (num * 1.0 / mid))
                return true;
            else if (mid > (num * 1.0 / mid))
                r = mid - 1;
            else
                l = mid + 1;
        }
        return false;
    }


}
