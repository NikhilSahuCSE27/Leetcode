class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        Stack<Integer> s=new Stack<>();
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--){
            int count=0;
            while(!s.isEmpty() && s.peek()<heights[i]){
                s.pop();
                count++;
            }
            if(!s.isEmpty()){
                count++;
            }
            res[i]=count;
            s.push(heights[i]);
        }
        return res;
    }
}