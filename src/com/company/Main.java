package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LeetCode leetCode = new LeetCode();
        //System.out.println(leetCode.GrayCode(2));
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(leetCode.lengthOfLIS(nums));
    }
}
