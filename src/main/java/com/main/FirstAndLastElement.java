package com.main;

public class FirstAndLastElement {
    public int[] searchRange(int[] nums, int target) {
        try {
            if (nums.length == 0) {
                return new int[] {-1, -1};
            }
            int result = searchTarget(nums, 0, nums.length - 1, target);
            int min = result;
            while (min >= 0) {
                if (min - 1 >= 0 && nums[result] == nums[min - 1]) {
                    min--;
                } else break;
            }

            int max = result;
            while (max < nums.length) {
                if (max + 1 < nums.length && nums[result] == nums[max + 1]) {
                    max++;
                } else break;
            }
            return new int[] {min, max};
        } catch (IllegalArgumentException illegalArgumentException) {
            return new int[] {-1, -1};
        }
    }

    public int searchTarget(int[] nums, int first, int last, int target) throws IllegalArgumentException {
        if (first == last && nums[first] != target) {
            throw new IllegalArgumentException();
        } else if ((last - first == 1) && (nums[first] != target && nums[last] != target)) {
           throw new IllegalArgumentException();
        } else if (nums[first] == target) {
            return first;
        } else if (nums[last] == target) {
            return last;
        } else {
            int mid = (last + first)/2;
            if (nums[mid] <= target) {
                return searchTarget(nums, mid, last, target);
            } else {
                return searchTarget(nums, first, mid, target);
            }
        }
    }

    public int searchStartIndex(int[] nums, int first, int last, int target) throws IllegalArgumentException {
        if (first == last && nums[first] != target) {
            throw new IllegalArgumentException();
        } else if ((last - first == 1) && (nums[first] != target && nums[last] != target)) {
            throw new IllegalArgumentException();
        } else if (nums[first] == target) {
            return first;
        } else if (nums[last] == target) {
            return last;
        } else {
            int mid = (last + first)/2;
            if (nums[mid] <= target) {
                return searchTarget(nums, mid, last, target);
            } else {
                return searchTarget(nums, first, mid, target);
            }
        }
    }

}
