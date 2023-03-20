package com.vikas.dsa.practice.arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumMaxSubArrayTest {

    @Test
    public void testFindMaxSubArray() {
        // Test case 1: array with positive integers, valid target sum
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int targetSum1 = 12;
        int expected1 = 3;
        int actual1 = SumMaxSubArray.findMaxSubArrayAllNumbers(arr1, targetSum1);
        assertEquals("Length of longest subarray with sum " + targetSum1 + " should be " + expected1, expected1, actual1);

        // Test case 2: array with negative integers, valid target sum
        int[] arr2 = { -3, -6, -1, -8, -2, -5 };
        int targetSum2 = -9;
        int expected2 = 2;
        int actual2 = SumMaxSubArray.findMaxSubArrayAllNumbers(arr2, targetSum2);
        assertEquals("Length of longest subarray with sum " + targetSum2 + " should be " + expected2, expected2, actual2);

        // Test case 3: array with only one element, valid target sum
        int[] arr3 = { 5 };
        int targetSum3 = 5;
        int expected3 = 1;
        int actual3 = SumMaxSubArray.findMaxSubArrayAllNumbers(arr3, targetSum3);
        assertEquals("Length of longest subarray with sum " + targetSum3 + " should be " + expected3, expected3, actual3);

        // Test case 4: array with no subarray with target sum
        int[] arr4 = { 1, 2, 3, 4, 5, 6 };
        int targetSum4 = 0;
        int expected4 = 0;
        int actual4 = SumMaxSubArray.findMaxSubArrayAllNumbers(arr4, targetSum4);
        assertEquals("Length of longest subarray with sum " + targetSum4 + " should be " + expected4, expected4, actual4);
    }
}

