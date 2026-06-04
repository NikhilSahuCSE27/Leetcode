class Solution {
    public int maxIceCream(int[] costs,int coins){
    Arrays.sort(costs);
    int res=0;
    for(int c:costs){
        if(coins<c){
            break;
        }
        coins=coins-c;
        res++;
    }
    return res;
}
}