class Solution {
    public String maximumBinaryString(String s){
    int zero=0,first=-1;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0'){
            zero++;
            if(first==-1){
                first=i;
            }
        }
    }
    if(zero<=1){
        return s;
    }
    char[] res=new char[s.length()];
    Arrays.fill(res,'1');
    res[first+zero-1]='0';
    return new String(res);
}
}