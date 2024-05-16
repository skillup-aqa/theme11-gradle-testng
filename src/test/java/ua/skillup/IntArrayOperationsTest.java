package ua.skillup;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntArrayOperationsTest {
    @Test
    public void testFillWithNumbers() {
        int[] array1 = IntArrayOperations.fillWithNumbers(new int[100]);
        int[] array2 = IntArrayOperations.fillWithNumbers(new int[100]);
        assertNotEquals(array1, array2);
    }

    @Test
    public void testMaxPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        assertEquals(IntArrayOperations.max(array1), 56);
    }

    @Test
    public void testMinPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        assertEquals(IntArrayOperations.min(array1), 1);
    }

    @Test
    public void testSumPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        assertEquals(IntArrayOperations.sum(array1), 73);
    }

    @Test
    public void testAvgPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        assertEquals(IntArrayOperations.avg(array1), 12);
    }

    @Test
    public void testReversePositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        int[] arrayReversed = {7, 56, 4, 3, 2, 1};
        assertTrue(Arrays.equals(IntArrayOperations.reverse(array1), arrayReversed));
    }

    @Test
    public void testCopyPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        int[] array2 = {1, 2, 3, 4, 56, 7};
        assertTrue((Arrays.equals(array1, array2)));
    }

    @Test
    public void testIndexOfPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7};
        assertEquals(IntArrayOperations.indexOf(array1, 56), 4);
    }

    @Test
    public void testRemoveDuplicatesPositive() {
        int[] array1 = {1, 2, 3, 4, 56, 7, 4, 8, 3};
        int[] array2 = {1, 2, 3, 4, 56, 7, 8};
        assertTrue(Arrays.equals(IntArrayOperations.removeDuplicates(array1), array2));
    }

    @Test
    public void testSortAscending() {
        int[] array1 = {3, 5, 4, 2, 1};
        int[] array2 = {1, 2, 3, 4, 5};
        assertArrayEquals(IntArrayOperations.sort(array1, true), array2);
    }

    @Test
    public void testSortDescending() {
        int[] array1 = {3, 5, 4, 2, 1};
        int[] array2 = {5, 4, 3, 2, 1};
        assertArrayEquals(IntArrayOperations.sort(array1, false), array2);
    }

    @Test
    public void testIsSortedAscending() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertTrue(IntArrayOperations.isSorted(array1, true));
    }

    @Test
    public void testIsSortedDescending() {
        int[] array2 = {5, 4, 3, 2, 1};
        assertTrue(IntArrayOperations.isSorted(array2, false));
    }

    @Test
    public void testMergePositive() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] merged = {1,2,3,4,5,5,4,3,2,1};
        assertArrayEquals(IntArrayOperations.merge(array1,array2), merged);
    }

    @Test
    public void testBinarySearchAscendingPositive() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.binarySearch(array1, 4, true), 3);
    }

    @Test
    public void testBinarySearchDescendingPositive() {
        int[] array1 = {5,4,3,2,1};
        assertEquals(IntArrayOperations.binarySearch(array1, 4, false), 1);
    }
}

