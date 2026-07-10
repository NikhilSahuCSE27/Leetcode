class Solution {
    public int findMinDifference(List<String> timePoints){
    List<Integer> list=new ArrayList<>();
    for(String s:timePoints){
        String[] p=s.split(":");
        list.add(
            Integer.parseInt(p[0])*60+
            Integer.parseInt(p[1])
        );
    }
    Collections.sort(list);
    int res=1440+list.get(0)-list.get(list.size()-1);
    for(int i=1;i<list.size();i++){
        res=Math.min(res,list.get(i)-list.get(i-1));
    }
    return res;
}
}