package common.algorithm;

import java.util.Random;

/**
 * The QuickSelect algorithm quickly finds the k-th smallest element of an unsorted array of n elements.
 * It is a RandomizedAlgorithm, so we compute the worst-case expected running time.
 *
 * This gives T(n) = O(n). It's clearly Omega(n), so we get T(n) = Theta(n).
 */
public class QuickSelect {
    public int selectIterative(int[] array, int n) {
        return iterative(array, 0, array.length - 1, n - 1);
    }

    private int iterative(int[] array, int left, int right, int n) {
        if (left == right) {
            return array[left];
        }

        while(true) {
            int pivotIndex = randomPivot(left, right);
            pivotIndex = partition(array, left, right, pivotIndex);

            if (n == pivotIndex) {
                return array[pivotIndex];
            } else if (n < pivotIndex) {
                right = pivotIndex - 1;
            } else {
                left = pivotIndex + 1;
            }
        }
    }

    /**
     * In quicksort, there is a subprocedure called partition that can, in
     * linear time, group a list (ranging from indices left to right) into two
     * parts, those less than a certain element, and those greater than or equal
     * to the element. Here is pseudocode that performs a partition about the
     * element list[pivotIndex]
     */
    private int partition(int[] array, int left, int right, int pivotIndex) {
        int pivotValue = array[pivotIndex];
        swap(array, pivotIndex, right); // move pivot to end
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (array[i] < pivotValue) {
                swap(array, storeIndex, i);
                storeIndex++;
            }
        }
        swap(array, right, storeIndex); // Move pivot to its final place
        return storeIndex;
    }

    private void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    private int randomPivot(int left, int right) {
        Random rand = new Random();
        return rand.nextInt(right - left + 1) + left;
    }

}
