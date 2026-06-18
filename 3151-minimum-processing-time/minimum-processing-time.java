class Solution {
    public int minProcessingTime(List<Integer> p,List<Integer> t){
    Collections.sort(p);
    t.sort(Collections.reverseOrder());
    int res=0;
    for(int i=0;i<p.size();i++){
        res=Math.max(res,p.get(i)+t.get(i*4));
    }
    return res;
}
}