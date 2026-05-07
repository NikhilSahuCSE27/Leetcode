class Solution {
    public long maxAlternatingSum(int[] nums){
    long even=0;
    long odd=0;
    for(int n:nums){
        long neven=Math.max(even,odd+n);
        long nodd=Math.max(odd,even-n);
        even=neven;
        odd=nodd;
    }
    return even;
}
}