class Solution {
    public int minFlips(String target){
    int res=0;
    char cur='0';
    for(char c:target.toCharArray()){
        if(c!=cur){
            res++;
            cur=c;
        }
    }
    return res;
}
}