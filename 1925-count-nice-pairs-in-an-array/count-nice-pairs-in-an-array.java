class Solution {
    public int countNicePairs(int[] nums){
    Map<Integer,Integer> map=new HashMap<>();
    int res=0,mod=1000000007;
    for(int n:nums){
        int key=n-rev(n);
        int cnt=map.getOrDefault(key,0);
        res=(res+cnt)%mod;
        map.put(key,cnt+1);
    }
    return res;
}
int rev(int n){
    int r=0;
    while(n>0){
        r=r*10+n%10;
        n=n/10;
    }
    return r;
}
}