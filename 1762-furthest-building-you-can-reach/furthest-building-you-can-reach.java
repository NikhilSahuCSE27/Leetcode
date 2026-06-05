class Solution {
    public int furthestBuilding(int[] h,int bricks,int ladders){
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    for(int i=0;i<h.length-1;i++){
        int diff=h[i+1]-h[i];
        if(diff>0){
            pq.add(diff);
            if(pq.size()>ladders){
                bricks=bricks-pq.poll();
            }
            if(bricks<0){
                return i;
            }
        }
    }
    return h.length-1;
}
}