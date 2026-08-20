class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        int maxc=count;
        for(int i=k;i<s.length();i++){
            char c=s.charAt(i-k);
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                count--;
            }
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
            maxc=Math.max(count,maxc);
            
        }
        return maxc;
    }
}