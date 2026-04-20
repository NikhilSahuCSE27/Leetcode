class Solution {
    public int maxScore(int[] cardPoints,int k){
    int n=cardPoints.length,sum=0;
    for(int i=0;i<k;i++){
        sum=sum+cardPoints[i];
    } 
    int res=sum;
    for(int i=1;i<=k;i++){
        sum=sum-cardPoints[k-i]+cardPoints[n-i];
        res=Math.max(res,sum);
    }
    return res;
}
}