package com.main;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubarraySum {
    long solution(long input) {
        List<Long> chars = new ArrayList<>();
        long auxInput = input;
        while (auxInput >= 1) {
            Long l = auxInput % 10;
            chars.add(0, l);
            auxInput = auxInput/10;
        }

        boolean reversed = false;
        for (int i = chars.size() - 1; i > 0; i--) {
            if (chars.get(i) > chars.get(i-1)) {
                long temp = chars.get(i);
                chars.set(i, chars.get(i-1));
                chars.set(i - 1, temp);
                reversed = true;
                break;
            }
        }

        long result = 0;
        if (reversed) {
            for (int i = 0; i < chars.size(); i++) {
                result = result * 10 + chars.get(i);
            }
            return result;
        } else return -1;

    }
}
