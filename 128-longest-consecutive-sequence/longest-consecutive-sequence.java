class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
        }
        int lo=0;
        for(int n:s){
            if(!s.contains(n-1)){
                int cnum=n;
                int count=1;
                while(s.contains(cnum+1)){
                    cnum=cnum+1;
                    count=count+1;
                }
                if(count>lo){
                    lo=count;
                }
            }
        }
        return lo;
    }
}