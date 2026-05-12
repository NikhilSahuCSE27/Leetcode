class Solution {
    public int maxScoreSightseeingPair(int[] values){
    int best=values[0];
    int res=0;
    for(int i=1;i<values.length;i++){
        res=Math.max(res,best+values[i]-i);
        best=Math.max(best,values[i]+i);
    }
    return res;
}
}