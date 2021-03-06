package me.hackhub.leetcode.solution;

import org.junit.Assert;
import org.junit.Test;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 17:42
 * @Description: https://leetcode-cn.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 */

public class LeetCode5854Test {

    private final LeetCode5854 solution = new LeetCode5854();

    @Test
    public void test1() {
        int result = solution.minimumDifference(new int[]{2, 1, 3}, 1);
        Assert.assertEquals(0, result);
    }

    @Test
    public void test2() {
        int result = solution.minimumDifference(new int[]{9, 4, 1, 7}, 2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test3() {
        int result = solution.minimumDifference(new int[]{9, 4, 1, 7}, 5);
        Assert.assertEquals(8, result);
    }
}