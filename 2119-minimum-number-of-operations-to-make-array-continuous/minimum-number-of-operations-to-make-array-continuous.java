class Solution{
    public int minOperations(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        int[] arr=Arrays.stream(nums).distinct().toArray();
        int res=n,l=0;
        for(int r=0;r<arr.length;r++){
            while(arr[r]-arr[l]>=n) l++;
            res=Math.min(res,n-(r-l+1));
        }
        return res;
    }
}