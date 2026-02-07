class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        double max=sum;
        double avg=sum/k;
        double maxavg=avg;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            avg=sum/k;
            maxavg=Math.max(avg,maxavg);
        }
    return maxavg;
    }
}