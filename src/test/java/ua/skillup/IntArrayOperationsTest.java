package ua.skillup;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntArrayOperationsTest {
    @Test
    public void testFillWithNumbers() {
        int[] array1 = IntArrayOperations.fillWithNumbers(new int[100]);
        int[] array2 = IntArrayOperations.fillWithNumbers(new int[100]);
        assertNotEquals(array1, array2);
    }

    @Test
    public void testMaxLast() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.max(array1), 5);
    }

    @Test
    public void testMaxFirst() {
        int[] array1 = {5, 4, 3, 2, 1};
        assertEquals(IntArrayOperations.max(array1), 5);
    }

    @Test
    public void testMaxForEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.max(array1), 0);
    }

    @Test
    public void testMin() {
        int[] array1 = {3, 2, 1, 1, 2};
        assertEquals(IntArrayOperations.min(array1), 1);
    }

    @Test
    public void testMinForEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.min(array1), 0);
    }

    @Test
    public void testSum() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.sum(array1), 15);
    }

    @Test
    public void testSumForEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.sum(array1), 0);
    }

    @Test
    public void testAverage() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.avg(array1), 3);
    }

    @Test
    public void testAverageForEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.avg(array1), 0);
    }

    @Test
    public void testReverse() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] reversed = IntArrayOperations.reverse(array1);
        assertEquals(reversed, new int[]{5, 4, 3, 2, 1});
    }

    @Test
    public void testCopy() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] copied = IntArrayOperations.copy(array1);
        assertEquals(copied, array1);
    }

    @Test
    public void testIndexOf() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.indexOf(array1, 3), 2);
    }

    @Test
    public void testIndexOfNotFound() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.indexOf(array1, 6), -1);
    }

    @Test
    public void testRemoveDuplicates() {
        int[] array1 = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = IntArrayOperations.removeDuplicates(array1);
        assertEquals(result, expected);
    }

    @Test
    public void testRemoveDuplicatesForEmptyArray() {
        int[] array1 = {};
        int[] expected = {};
        int[] result = IntArrayOperations.removeDuplicates(array1);
        assertEquals(result, expected);
    }

    @Test
    public void testIsSortedAsc() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertTrue(IntArrayOperations.isSorted(array1, true));
    }

    @Test
    public void testIsSortedDesc() {
        int[] array1 = {5, 4, 3, 2, 1};
        assertTrue(IntArrayOperations.isSorted(array1, false));
    }

    @Test
    public void testIsSortedForEmptyArray() {
        int[] array1 = {};
        assertTrue(IntArrayOperations.isSorted(array1, true));
        assertTrue(IntArrayOperations.isSorted(array1, false));
    }

    @Test
    public void testIsSortedForSingleElementArray() {
        int[] array1 = {1};
        assertTrue(IntArrayOperations.isSorted(array1, true));
        assertTrue(IntArrayOperations.isSorted(array1, false));
    }

    @Test
    public void testIsSortedForArrayOfEquals() {
        int[] array1 = {1, 1, 1, 1, 1};
        assertTrue(IntArrayOperations.isSorted(array1, true));
        assertTrue(IntArrayOperations.isSorted(array1, false));
    }

    @Test
    public void testIsSortedForUnsortedArray() {
        int[] array1 = {1, 2, 1, 2, 1};
        assertFalse(IntArrayOperations.isSorted(array1, true));
        assertFalse(IntArrayOperations.isSorted(array1, false));
    }

    @Test
    public void testSortAsc() {
        int[] array1 = {1, 3, 5, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = IntArrayOperations.sort(array1, true);
        assertEquals(result, expected);
    }

    @Test
    public void testSortDesc() {
        int[] array1 = {1, 3, 5, 4, 2};
        int[] expected = {5, 4, 3, 2, 1};
        int[] result = IntArrayOperations.sort(array1, false);
        assertEquals(result, expected);
    }

    @Test
    public void testSortForEmptyArray() {
        int[] array1 = {};
        int[] expected = {};
        int[] result = IntArrayOperations.sort(array1, true);
        assertEquals(result, expected);
    }

    @Test
    public void testSortForSingleElementArray() {
        int[] array1 = {1};
        int[] expected = {1};
        int[] result = IntArrayOperations.sort(array1, true);
        assertEquals(result, expected);
    }

    @Test
    public void testMerge() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] result = IntArrayOperations.merge(array1, array2);
        assertEquals(result, expected);
    }

    @Test
    public void testMergeForEmptyArray() {
        int[] array1 = {};
        int[] array2 = {};
        int[] expected = {};
        int[] result = IntArrayOperations.merge(array1, array2);
        assertEquals(result, expected);
    }

    @Test
    public void testBinarySearchMiddleVal() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.binarySearch(array1, 3, true), 2);
    }

    @Test
    public void testBinarySearchAscLeftVal() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.binarySearch(array1, 1, true), 0);
    }

    @Test
    public void testBinarySearchAscRightVal() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.binarySearch(array1, 5, true), 4);
    }

    @Test
    public void testBinarySearchDescMiddleVal() {
        int[] array1 = {5, 4, 3, 2, 1};
        assertEquals(IntArrayOperations.binarySearch(array1, 3, false), 2);
    }

    @Test
    public void testBinarySearchDescLeftVal() {
        int[] array1 = {5, 4, 3, 2, 1};
        assertEquals(IntArrayOperations.binarySearch(array1, 5, false), 0);
    }

    @Test
    public void testBinarySearchDescRightVal() {
        int[] array1 = {5, 4, 3, 2, 1};
        assertEquals(IntArrayOperations.binarySearch(array1, 1, false), 4);
    }

    @Test
    public void testBinarySearchForUnsortedArray() {
        int[] array1 = {1, 3, 5, 4, 2};
        assertEquals(IntArrayOperations.binarySearch(array1, 3, false), -1);
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(IntArrayOperations.binarySearch(array1, 6, true), -1);
    }

    @Test
    public void testBinarySearchForEmptyArray() {
        int[] array1 = {};
        assertEquals(IntArrayOperations.binarySearch(array1, 6, true), -1);
    }

    @Test
    public void testBinarySearchForSingleElementArray() {
        int[] array1 = {1};
        assertEquals(IntArrayOperations.binarySearch(array1, 1, true), 0);
    }
}