package test.InterviewProgramQuestions;

import java.util.*;

/*Methos to find the closest to the target or user input by using two pointers technique, left and right.
 * move them towards each other based on their absolute difference with target.
 * This approach gives a good time complexity of O(N). Auxilary space - O(1)
 * Approach 1 - Using binary search but the time complexity is more O(n-1)
 * Approach 3 - Recursive approach
 */
public class ClosestNumber {
    public static int findClosest(int[] arr, int n,
                                  int target)
    {
        int left = 0, right = n - 1;
        while (left < right) {
            if (Math.abs(arr[left] - target)
                <= Math.abs(arr[right] - target)) {
                right--;
            }
            else {
                left++;
            }
        }
        return arr[left];
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 4, 5, 6, 6, 8, 8, 9 };
        int n = arr.length;
        int target = 11;
        System.out.println(findClosest(arr, n, target));
    }
}
