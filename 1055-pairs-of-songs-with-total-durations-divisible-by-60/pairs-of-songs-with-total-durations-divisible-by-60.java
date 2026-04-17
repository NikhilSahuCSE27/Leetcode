class Solution {
    public int numPairsDivisibleBy60(int[] time){
    int[] f=new int[60];
    int res=0;
    for(int t:time){
        int x=(60-t%60)%60;
        res+=f[x];
        f[t%60]++;
    }
    return res;
}
}