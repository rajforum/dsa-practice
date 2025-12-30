/*
    Given a sorted array of integers nums, determine if there exists a pair of numbers that sum to a given target.
*/

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,4,6,8,10,13};
        int[] arr1 = {1,3,4,6,8,10,13};

        boolean result = new TwoSum().isPair(arr1, 13);

        System.out.println("Result: "+ result);
        
    }

    public boolean isPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int sum = 0;

        while (left < right) {
            sum = arr[left] + arr[right];

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                System.out.printf("[%d, %d]\n", arr[left], arr[right]);
                return true;
            }
        }

        return false;
    }
}