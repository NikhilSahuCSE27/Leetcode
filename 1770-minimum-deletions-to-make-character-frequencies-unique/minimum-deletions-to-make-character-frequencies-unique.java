class Solution {
    public int minDeletions(String s){
    int[] f=new int[26];
    for(char c:s.toCharArray()){
 f[c-'a']++;
    }
    Set<Integer> set=new HashSet<>();
    int res=0;
    for(int x:f){
        while(x>0&&!set.add(x)){
            x--;
            res++;
        }
    }
    return res;
}
}