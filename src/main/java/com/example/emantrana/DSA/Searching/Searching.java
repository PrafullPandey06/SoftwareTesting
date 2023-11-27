package com.example.emantrana.DSA.Searching;

public class Searching {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int ternarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            if (array[mid1] == target) {
                return mid1;
            } else if (array[mid2] == target) {
                return mid2;
            } else if (target < array[mid1]) {
                high = mid1 - 1;
            } else if (target > array[mid2]) {
                low = mid2 + 1;
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }

        return -1;
    }

    public static int interpolationSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high && target >= array[low] && target <= array[high]) {
            if (low == high) {
                if (array[low] == target) {
                    return low;
                }
                return -1;
            }

            int pos = low + ((target - array[low]) * (high - low) / (array[high] - array[low]));

            if (array[pos] == target) {
                return pos;
            } else if (array[pos] < target) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        return -1;
    }
}
