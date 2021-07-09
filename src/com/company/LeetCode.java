package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode {

    public List<Integer> GrayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);

        for(int num = 1; num <= n ; num++) {
            int size = result.size();
            int mask = 1 << (num-1);

            for(int i=size-1;i>=0;i--) {
                result.add(result.get(i) | mask);
            }
        }
        return result;
    }

    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] result = new int[len+1];
        int ans = 1;
        Arrays.fill(result, 1);
        for(int i = 1 ; i < len ; i++) {
            for(int j=0; j<i ; j++) {
                if(nums[i] > nums[j]) {
                    result[i] = Math.max(result[i], result[j]+1);
                    ans = Math.max(ans, result[i]);
                }
            }
        }
        return ans;
    }
}
