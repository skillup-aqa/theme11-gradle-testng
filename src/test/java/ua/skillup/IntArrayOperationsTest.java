package ua.skillup;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntArrayOperationsTest {
    @Test
    public void dummyTest() {
        assertTrue(true);
    }

    @Test
    public void testFillWithNumbers() {
        int[] array1 = IntArrayOperations.fillWithNumbers(new int[1000]);
        int[] array2 = IntArrayOperations.fillWithNumbers(new int[1000]);
        assertNotEquals(array1, array2);
    }

    @Test
    public void testMaxValue() {
        int[] array1 = {2, 4, 6, 8, 10};
        assertEquals(IntArrayOperations.max(array1), 10);
    }

    @Test
    public void testMaxEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.max(array1), 0);
    }

    @Test
    public void testMinValue() {
        int[] array1 = {2, 4, 6, 8, 10};
        assertEquals(IntArrayOperations.min(array1), 2);
    }

    @Test
    public void testMinEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.min(array1), 0);
    }

    @Test
    public void testSum() {
        int[] array1 = {2, 4, 6, 8, 10};
        assertEquals(IntArrayOperations.sum(array1), 30);
    }

    @Test
    public void testSumEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.sum(array1), 0);
    }

    @Test
    public void testAvgValue() {
        int[] array1 = {2, 4, 6, 8, 10};
        assertEquals(IntArrayOperations.avg(array1), 6);
    }

    @Test
    public void testAvgValueEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.avg(array1), 0);
    }

    @Test
    public void testReverse() {
        int[] array1 = {2, 4, 6, 8, 10};
        int[] reversed = IntArrayOperations.reverse(array1);
        assertEquals(reversed, new int[]{10, 8, 6, 4, 2});
    }

    @Test
    public void testCopy() {
        int[] array1 = {2, 4, 6, 8, 10};
        int[] copied = IntArrayOperations.copy(array1);
        assertEquals(copied, array1);
    }

    @Test
    public void testIndexOf() {
        int[] array1 = {2, 4, 6, 8, 10};
        assertEquals(IntArrayOperations.indexOf(array1, 8), 3);
    }

    @Test
    public void testIndexOfAbsent() {
        int[] array1 = {2, 4, 6, 8, 10};
        assertEquals(IntArrayOperations.indexOf(array1, 20), -1);
    }

    @Test
    public void testDeleteDuplicates() {
        int[] array1 = {2, 4, 6, 8, 10, 2, 4, 6, 8, 10};
        int[] arrayexpected = {2, 4, 6, 8, 10};
        int[] result = IntArrayOperations.removeDuplicates(array1);
        assertEquals(result, arrayexpected);
    }

    @Test
    public void testDeleteDuplicatesEmptyArray() {
        int[] array1 = {};
        int[] arrayexpected = {};
        int[] result = IntArrayOperations.removeDuplicates(array1);
        assertEquals(result, arrayexpected);
    }

    @Test
    public void testIsSortedAsc() {
        int[] array1 = {2, 4, 6, 8, 10};
        assertTrue(IntArrayOperations.isSorted(array1, true));
    }

    @Test
    public void testIsSortedEmptyArray() {
        int[] array1 = {};
        assertTrue(IntArrayOperations.isSorted(array1, true));
        assertTrue(IntArrayOperations.isSorted(array1, false));
    }

    @Test
    public void testIsSortedDesc() {
        int[] array1 = {10, 8, 6, 4, 2};
        assertTrue(IntArrayOperations.isSorted(array1, false));
    }

    @Test
    public void testIsSortedUnsortedArray() {
        int[] array1 = {8, 2, 6, 10, 4};
        assertFalse(IntArrayOperations.isSorted(array1, true));
        assertFalse(IntArrayOperations.isSorted(array1, false));
    }

    @Test
    public void testSortAscending() {
        int[] array1 = {8, 4, 2, 6, 10};
        int[] arrayexpected = {2, 4, 6, 8, 10};
        int[] result = IntArrayOperations.sort(array1, true);
        assertEquals(result, arrayexpected);

    }

    @Test
    public void testSortDescending() {
        int[] array1 = {8, 4, 2, 6, 10};
        int[] arrayexpected = {10, 8, 6, 4, 2};
        int[] result = IntArrayOperations.sort(array1, false);
        assertEquals(result, arrayexpected);
    }

    @Test
    public void testSortEmptyArray() {
        int[] array1 = {};
        int[] arrayexpected = {};
        int[] result = IntArrayOperations.sort(array1, true);
        assertEquals(result, arrayexpected);
    }

    @Test
    public void testMarge() {
        int[] array1 = {2, 4, 6};
        int[] array2 = {8, 10, 12};
        int[] arrayexpected = {2, 4, 6, 8, 10, 12};
        int[] result = IntArrayOperations.merge(array1, array2);
        assertEquals(result, arrayexpected);
    }

    @Test
    public void testMargeEmptyArrays() {
        int[] array1 = {};
        int[] array2 = {};
        int[] arrayexpected = {};
        int[] result = IntArrayOperations.merge(array1, array2);
        assertEquals(result, arrayexpected);
    }

    @Test
    public void testBinarySearchAscending() {
        int[] array1 = {2, 4, 6, 8, 10};
        assertEquals(IntArrayOperations.binarySearch(array1, 8, true), 3);
    }

    @Test
    public void testBinarySearchDescending() {
        int[] array1 = {10, 8, 6, 4, 2};
        assertEquals(IntArrayOperations.binarySearch(array1, 8, false), 1);
    }

    @Test
    public void testBinarySearchUnsortedArray() {
        int[] array1 = {8, 4, 10, 2, 6};
        assertEquals(IntArrayOperations.binarySearch(array1, 4, false), -1);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.binarySearch(array1, 20, true), -1);
    }
}

