/*
Given an array heights where each element represents the height of a vertical line, pick two lines to form a container. Return the maximum area (amount of water) the container can hold.
What is area? Width × height, where width is the distance between walls, and height is the shorter wall (water overflows at the shorter wall).

Leetcode: https://leetcode.com/problems/container-with-most-water/description/
*/

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 2, 2, 4, 1, 3, 2};
        int arr1[] = {1,2,1};

        System.out.println("Max area: "+ new ContainerWithMostWater().maxArea(arr1));
    }

    public int maxArea(int[] arr) {
        int area = 0;
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int len = right - left;
            int width = Math.min(arr[left], arr[right]);
            int blockArea = len * width;

            if (area < blockArea) {
                area = blockArea;
            }

            if (arr[left] <= arr[right]) {
                left++;
            } else if (arr[left] > arr[right]) {
                right--;
            }
        }
        
        return area;
    }


}