class Solution {
    public int minMoves2(int[] nums){
    Arrays.sort(nums);
    int m=nums[nums.length/2];
    int res=0;
    for(int n:nums){
        res=res+Math.abs(n-m);
    }
    return res;
}
}