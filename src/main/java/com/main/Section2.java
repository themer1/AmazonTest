package com.main;

import java.util.ArrayList;
import java.util.List;

public class Section2 {
    /*merge intervals: https://leetcode.com/problems/merge-intervals/*/

    public int[][] merge(int[][] intervals) {
        boolean merged = true;
        java.util.Arrays.sort(intervals, new java.util.Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]);
            }
        });
        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = i+1; j < intervals.length; j++) {
                if (intervals[i][0] > intervals[j][0] && intervals[i][0] <= intervals[j][1]) {
                    intervals[i][0] = intervals[j][0];
                }
                if (intervals[i][1] >= intervals[j][0] && intervals[i][1] <= intervals[j][1]) {
                    intervals[i][1] = intervals[j][1];
                }
                if (intervals[i][0] <= intervals[j][0] && intervals[i][1] >= intervals[j][1]) {
                    intervals[j][0] = 0;
                    intervals[j][1] = -1;
                }
            }
        }

        List<int[]> output = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[0] <= interval[1]) {
                output.add(interval);
            }
        }
        int[][] actualOutput =  new int[output.size()][];
        actualOutput = output.toArray(actualOutput);
        return actualOutput;
    }

    public int[][] merge1(int[][] intervals) {
        ArrayList<int[]> outputList = new ArrayList<>();
        java.util.Arrays.sort(intervals, new java.util.Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]);
            }
        });
        for (int[] interval : intervals) {
            if (outputList.isEmpty()) {
                outputList.add(interval);
            } else {
                boolean wasSet = false;
                for (int j = 0; j < outputList.size(); j++) {
                    if (interval[0] <= outputList.get(j)[0] && outputList.get(j)[0] < interval[1]) {
                        outputList.set(j, new int[]{interval[0], outputList.get(j)[1]});
                        wasSet = true;
                    }
                    if (interval[0] <= outputList.get(j)[1] && outputList.get(j)[1] <= interval[1]) {
                        outputList.set(j, new int[]{outputList.get(j)[0], interval[1]});
                        wasSet = true;
                    }
                    if ((interval[0] >= outputList.get(j)[0] && outputList.get(j)[1] >= interval[1])) {
                        wasSet = true;
                    }
                }
                if (!wasSet) {
                    outputList.add(interval);
                }
            }
        }
        return outputList.toArray(new int[outputList.size()][]);
    }

    /*Number of isleands: https://leetcode.com/problems/number-of-islands/*/
    int numOfIslands = 0;
    public int numIslands(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numOfIslands++;
                    grid = markIsland(grid, i, j);
                }
            }
        }
        return numOfIslands;
    }

    private char[][] markIsland(char[][] grid, int i, int j) {

        if (i == grid.length || j == grid[i].length) {
            return grid;
        }
        if (j == -1 || i == -1) {
            return grid;
        }
        if (grid[i][j] == '0' || grid[i][j] == '2') {
            return grid;
        } else if (grid[i][j] == '1') {
            if (j < grid[i].length) {
                grid = markIsland(grid, i, j+1);
                grid[i][j] = '2';
            }
            if (i < grid.length) {
                grid = markIsland(grid, i+1, j);
                grid[i][j] = '2';
            }

            if (j >= 1) {
                if (grid[i][j-1] == '1') {
                    grid = markIsland(grid, i, j-1);
                    grid[i][j] = '2';
                }
            }

            if (i >= 1) {
                if (grid[i - 1][j] == '1') {
                    grid = markIsland(grid, i - 1, j);
                    grid[i][j] = '2';
                }
            }
        }
        return grid;
    }
}
