class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> x=new HashSet<>();
        for(int a:nums){
            if(x.contains(a)){
                return a;
            }
        x.add(a);
        }
        return -1;
    }
}