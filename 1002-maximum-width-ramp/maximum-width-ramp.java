class Solution {
    public int maxWidthRamp(int[] nums){
    Stack<Integer> st=new Stack<>();
    int n=nums.length,res=0;
    for(int i=0;i<n;i++){
        if(st.isEmpty()||nums[i]<nums[st.peek()]) st.push(i);
    }
    for(int i=n-1;i>=0;i--){
        while(!st.isEmpty()&&nums[i]>=nums[st.peek()]){
            res=Math.max(res,i-st.pop());
        }
    }
    return res;
}
}