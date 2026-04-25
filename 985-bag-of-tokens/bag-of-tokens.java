class Solution {
    public int bagOfTokensScore(int[] tokens,int power){
    Arrays.sort(tokens);
    int l=0,r=tokens.length-1,score=0,res=0;
    while(l<=r){
        if(power>=tokens[l]){
            power-=tokens[l++];
            res=Math.max(res,++score);
        }else if(score>0){
            power=power+tokens[r--];
            score--;
        }else{
        break;
        }
    }
    return res;
}
}