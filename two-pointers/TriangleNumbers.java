/*
    Write a function to count the number of triplets in an integer array nums that could form the sides of a triangle. 
    For three sides to form a valid triangle, the sum of any two sides must be greater than the third side. 
    The triplets do not need to be unique.
    
    Leetcode: https://leetcode.com/problems/valid-triangle-number/
*/

import java.util.Arrays;

public class TriangleNumbers {
    public static void main(String[] args) {
        int[] arr = {11,4,9,6,15,18};

        System.out.println("Count: "+ new TriangleNumbers().getTrianleNumber(arr));
        
    }

    public int getTrianleNumber(int[] arr) {
        int count = 0;
        int len = arr.length;

        Arrays.sort(arr);

        for (int i = len-1; i >= 0; i--) {
            int left = 0;
            int right = i-1;

            while (left < right) {
                if (arr[left] + arr[right] <= arr[i]) {
                    left++;
                } else {
                    count += (right - left);
                    right--;
                }
            }

        }

        return count;
    } 
}
