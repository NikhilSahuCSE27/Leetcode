class Solution {
    public int minPairSum(int[] nums) {
       Arrays.sort(nums);
       int l=0;
       int r=nums.length-1;
       int sum=0;
       int max=0;
       while(l<r){
        sum=nums[l]+nums[r];
        max=Math.max(sum,max);
        l++;
        r--;

       }
       return max;
    }
}