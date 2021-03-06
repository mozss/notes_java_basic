package com.mozss.basic.algorithms.leetcode.binary;

/**
 * @author mozss
 * @create 2019-09-05 23:58
 */
public class No441 {
    /*
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目名称:
     * 知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述:   你总共有n个硬币,你需要将它们摆成一个阶梯形状,第k行就必须正好有k个硬币
     *             给定一个数字n,找出可形成完整阶梯行的总行数;
     *             n是一个非负整数,并且在32位有符号整型的范围内.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 示例1：
     * n = 5
     * 硬币可以排列成以下几行：
     *  0
     *  0 0
     *  0 0
     *  因为第三行不完整，所以返回2
     *
     * 示例2：
     * n = 8
     * 硬币可以排列成一下几行：
     *  0
     *  0 0
     *  0 0 0
     *  0 0
     * 因为第四行不完整，所以返回3
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:
     * 题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */

    /**
     * @title:
     * @description: 数学求解O(1),不含求根预算
     * @param
     * @return: int
     * @author: mozss
     * @date: 2020/11/5 17:15
     **/
    public static int arrangeCoins_01(int n) {
        return (int) (-1 + Math.sqrt(1 + 8 * (long) n)) / 2;
    }

   /**
     * @title:
     * @description: 迭代法求解
     * @param
     * @return: int
     * @author: mozss
     * @date: 2020/11/5 17:15
     **/
    public static int arrangeCoins_02(int n) {
        int i = 1;
        while (n >= i) {
            n -= i;
            i++;
        }
        return i - 1;
    }

    /**
     * @title:
     * @description: 二分查找的方法 O(log(n/2 + 1)
     * @param
     * @return: int
     * @author: mozss
     * @date: 2020/11/5 17:16
     **/
    public static int arrangeCoins3(int n) {
        long start = 0, end = (long) n / 2 + 1, mid;
        while (end - start > 1) {
            mid = (start + end) >>> 1;
            if (mid * (mid + 1) == (long) 2 * n) {
                return (int) mid;
            } else if (mid * (mid + 1) <= (long) 2 * n) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return (end * (end + 1) == (long) 2 * n) ? (int) end : (int) start;
    }
}
