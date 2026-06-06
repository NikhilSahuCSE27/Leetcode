class Solution {
    public long putMarbles(int[] w,int k){
    long[] pair=new long[w.length-1];
    for(int i=0;i<w.length-1;i++){
        pair[i]=w[i]+w[i+1];
    }
    Arrays.sort(pair);
    long max=0,min=0;
    for(int i=0;i<k-1;i++){
        min=min+pair[i];
        max=max+pair[pair.length-1-i];
    }
    return max-min;
}
}