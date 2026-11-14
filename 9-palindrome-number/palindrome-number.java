class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int t=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int n=x%10;
            rev=rev*10+n;
            x=x/10;
        }
        if(rev==t){
            return true;
        }else{
            return false;
        }
    }
}