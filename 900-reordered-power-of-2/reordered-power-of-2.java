class Solution {
    public boolean reorderedPowerOf2(int n) {
        char x[]=String.valueOf(n).toCharArray();
        Arrays.sort(x);
        for(int i=0;i<31;i++){
            char b[]=String.valueOf(1<<i).toCharArray();
            Arrays.sort(b);
            if(Arrays.equals(x,b)){
                return true;
            }

        }
        return false;
    }
}