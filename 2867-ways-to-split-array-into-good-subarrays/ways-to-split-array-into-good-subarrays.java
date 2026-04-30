class Solution {
    public int numberOfGoodSubarraySplits(int[] nums){
    long res=1;
    int last=-1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            if(last!=-1) res=res*(i-last)%1000000007;
            last=i;
        }
    }
    return last==-1?0:(int)res;
}
}