package com.company;

import java.util.ArrayList;
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
}
