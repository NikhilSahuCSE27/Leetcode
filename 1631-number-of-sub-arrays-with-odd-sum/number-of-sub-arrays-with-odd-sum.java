class Solution{
    public int numOfSubarrays(int[] arr){
        int odd=0,even=1,sum=0,res=0,mod=1000000007;
        for(int n:arr){
            sum=sum+n;
            if(sum%2==0){
                res=(res+odd)%mod;
                even++;
            }else{
                res=(res+even)%mod;
                odd++;
            }
        }
        return res;
    }
}