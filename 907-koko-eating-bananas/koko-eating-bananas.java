class Solution {
    int minEatingSpeed(int[] piles, int h) {
    int l=1;
    int r=Arrays.stream(piles).max().getAsInt();
    while(l<r){
        int m=(l+r)/2;
        int hours=0;
        for(int p:piles)
        hours=hours+(p+m-1)/m;
        if(hours>h){
        l=m+1;
        }
        else{
            r=m;
        }
    }
    return l;
}
}