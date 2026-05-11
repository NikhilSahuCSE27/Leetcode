class Solution {
    public int deleteAndEarn(int[] nums){
    int[] sum=new int[10001];
    for(int n:nums){
        sum[n]=sum[n]+n;
    }
    int take=0,skip=0;
    for(int i=0;i<10001;i++){
        int takei=skip+sum[i];
        skip=Math.max(skip,take);
        take=takei;
    }
    return Math.max(take,skip);
}
}