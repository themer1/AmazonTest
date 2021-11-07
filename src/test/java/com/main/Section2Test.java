package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Section2Test {
    @Test
    public void testMerge() {
        Section2 section2 = new Section2();
        int[][] output = section2.merge1(new int[][] {{1,4},{4,5}});
        int[][] expectedOutput = new int[][] {{1, 5}};
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testMerge1() {
        Section2 section2 = new Section2();
        int[][] output = section2.merge1(new int[][] {{1,4},{0,4}});
        int[][] expectedOutput = {{0, 4}};
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testMerge2() {
        Section2 section2 = new Section2();
        int[][] output = section2.merge1(new int[][] {{1,4},{2,4}, {-1, 3}});
        int[][] expectedOutput = new int[][] {{-1, 4}};
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testMerge3() {
        Section2 section2 = new Section2();
        int[][] output = section2.merge1(new int[][] {{1,4}, {-1, 3}, {2, 6}, {7, 8}});
        int[][] expectedOutput = {{-1, 6}, {7, 8}};
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testMerge4() {
        Section2 section2 = new Section2();
        int[][] output = section2.merge1(new int[][] {{1,4}, {1, 5}});
        int[][] expectedOutput = new int[][] {{1, 5}};
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testMerge5() {
        Section2 section2 = new Section2();
        int[][] output = section2.merge1(new int[][] {{1,4}, {2, 3}});
        int[][] expectedOutput = new int[][] {{1, 4}};
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void testMerge6() {
        Section2 section2 = new Section2();
        int[][] output = section2.merge1(new int[][] {{1,4}, {0, 5}});
        int[][] expectedOutput = new int[][] {{0, 5}};
        assertArrayEquals(expectedOutput, output);
    }

//    @Test
//    public void testMerge7() {
//        Section2 section2 = new Section2();
//        int[][] output = section2.merge1(new int[][] {{1,4}, {0, 0}});
//        int[][] expectedOutput = new int[][] {{1, 4}, {0, 0}};
//        assertArrayEquals(expectedOutput, output);
//    }

    @Test
    public void testMerge8() {
        Section2 section2 = new Section2();
        int[][] output = section2.merge1(new int[][] {{0, 3}, {4,5}, {-1, 6}});
        int[][] expectedOutput = new int[][] {{-1, 6}};
        assertArrayEquals(expectedOutput, output);
    }

    // ["1"]

    @Test
    public void testNumIslandWithOneInput() {
        char[][] input = new char[][] {{'1'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(1, output);
    }

    @Test
    public void testNumIslandWithOneRow() {
        char[][] input = new char[][] {{'1', '1', '1', '1'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(1, output);
    }

    @Test
    public void testNumIslandWithOneColumn() {
        char[][] input = new char[][] {{'1'}, {'1'}, {'1'}, {'1'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(1, output);
    }

    @Test
    public void testNumIslandWithOneColumnTwoIslands() {
        char[][] input = new char[][] {{'1'}, {'1'}, {'0'}, {'1'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(2, output);
    }

    @Test
    public void testNumIslandWithTwoColumnTwoIslands() {
        char[][] input = new char[][] {{'1', '1'}, {'1', '0'}, {'0', '0'}, {'1', '1'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(2, output);
    }

    @Test
    public void testNumIslandWithThreeColumnTwoIslands() {
        char[][] input = new char[][] {{'1', '0', '0'}, {'0', '0', '0'}, {'0', '1', '0'}, {'0', '0', '1'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(3, output);
    }

    @Test
    public void testNumIslandWithOneRowTwoIslands() {
        char[][] input = new char[][] {{'1', '1', '0', '1'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(2, output);
    }

    @Test
    public void testNumIslandWithTwoRowsThreeIslands() {
        char[][] input = new char[][] {{'1', '1', '0', '1'}, {'0', '0', '1', '0'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(3, output);
    }

    @Test
    public void testNumIslandWithThreeRowsOneIslands() {
        char[][] input = new char[][] {{'1', '1', '1'}, {'0', '1', '0'}, {'1', '1', '1'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(1, output);
    }

    @Test
    public void testNumIslandWithThreeRowsOneIsland() {
        char[][] input = new char[][] {{'1', '1', '1'}, {'0', '0', '1'}, {'1', '1', '1'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(1, output);
    }

    @Test
    public void testNumIslandWithThreeRowsTwpIsland() {
        char[][] input = new char[][] {{'1', '0', '0'}, {'0', '0', '1'}, {'1', '1', '1'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(2, output);
    }

    @Test
    public void testNumIslandWithThreeRowsAnotherIsland() {
        char[][] input = new char[][] {{'1','0','1','1','1'}, {'1','0','1','0','1'},{'1','1','1','0','1'}};
        Section2 section2 = new Section2();
        int output = section2.numIslands(input);
        assertEquals(1, output);
    }
}