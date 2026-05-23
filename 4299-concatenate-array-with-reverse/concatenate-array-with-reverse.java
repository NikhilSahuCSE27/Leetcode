class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]=new int[2*nums.length];
        int x;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
           
        }
        x=nums.length;
        for(int i=nums.length-1;i>=0;i--){
            arr[x]=nums[i];
            x++;
        }
        return arr;

    }
}