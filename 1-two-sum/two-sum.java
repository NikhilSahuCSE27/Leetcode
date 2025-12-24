class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        // If no solution found, returning {-1, -1} or throwing an exception is appropriate
        // Here, I'll return {-1, -1} as an indication of no solution found.
        return new int[]{-1, -1};
    }
}
