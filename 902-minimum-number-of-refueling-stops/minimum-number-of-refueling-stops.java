class Solution {
    public int minRefuelStops(int target,int fuel,int[][] st){
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    int i=0,res=0,n=st.length;
    while(fuel<target){
        while(i<n&&st[i][0]<=fuel){
            pq.add(st[i++][1]);
        }
        if(pq.isEmpty()){
            return -1;
        }
        fuel=fuel+pq.poll();
        res++;
    }
    return res;
}
}