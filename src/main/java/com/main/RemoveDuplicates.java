package com.main;

public class RemoveDuplicates {
    //incomplete
    public int removeDuplicates(int[] nums) {
        int finalLength = 1;
        if (nums.length == 1) {
            return finalLength;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                int j = i+1;
                while (j < nums.length && nums[i] == nums[j]) {
                    j++;
                }
                nums[i+1] = nums[j];
            } else if (i >= 1 && nums[i] == nums[i-1]) {
                for (int j = i - 1; j < nums.length - 1; j++) {
                    nums[j] = nums[j+1];
                }
            }
        }
        int j = 0;
        while (j < nums.length - 1 && nums[j] != nums[j+1])  {
            j++;
            finalLength++;
        }
        return finalLength;
    }
}
