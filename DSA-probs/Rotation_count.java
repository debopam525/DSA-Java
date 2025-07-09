// Java program to find number of
// rotations in a sorted and rotated
// array.
import java.io.*;
import java.lang.*;
import java.util.*;

class Rotation_count {
    public static void main(String[] args)
    {
        int arr[] = { 4,5,6,7,0,1,2,3};
        int n = arr.length;

        System.out.println(countRotations(arr, 0,  n - 1));
    }
    static int countRotations(int arr[], int start, int end)
    {
        // This condition is needed to handle
        // the case when array is not rotated
        // at all
        if (end < start)
            return 0;

        // If there is only one element left
        if (end == start)
            return start;

        int mid = start + (end - start) / 2;

        if (mid < end && arr[mid + 1] < arr[mid])
            return (mid + 1);

        if (mid > start && arr[mid] < arr[mid - 1])
            return mid;

        // Decide whether we need to go to left
        // half or right half
        if (arr[end] > arr[mid])
            return countRotations(arr, start, mid - 1);

        return countRotations(arr, mid + 1, end);
    }
}