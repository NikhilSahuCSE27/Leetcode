class Solution {
    public int numSubarrayBoundedMax(int[] nums,int l,int r){
    int res=0,lastBad=-1,lastGood=-1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>r) lastBad=i;
        if(nums[i]>=l) lastGood=i;
        res=res+Math.max(0,lastGood-lastBad);
    }
    return res;
}
}