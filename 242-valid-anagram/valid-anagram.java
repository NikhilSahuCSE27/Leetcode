class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        boolean flag=true;
       int arr1[]=new int[s.length()];
       int arr2[]=new int[t.length()];
      
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        arr1[i]=ch;
       }
       for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        arr2[i]=ch;
       }
       Arrays.sort(arr1);
       Arrays.sort(arr2);
      for(int i=0;i<arr1.length;i++){
        if(arr1[i]!=arr2[i]){
            flag=false;
            break;
        }
      }
      return flag;

    }
}