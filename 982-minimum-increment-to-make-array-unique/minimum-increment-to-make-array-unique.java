class Solution {
    public int minIncrementForUnique(int[] nums){
    Arrays.sort(nums);
    int res=0;
    for(int i=1;i<nums.length;i++){
        if(nums[i]<=nums[i-1]){
            int need=nums[i-1]+1;
            res=res+need-nums[i];
            nums[i]=need;
        }
    }
    return res;
}
}