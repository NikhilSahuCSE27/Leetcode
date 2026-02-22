class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> a=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
             if(a.contains(nums[i])){
                res.add(nums[i]);
            }else{
            a.add(nums[i]);
            }
        }
        
        List<Integer> arr=new ArrayList<>(res);
        return arr;
    }
}