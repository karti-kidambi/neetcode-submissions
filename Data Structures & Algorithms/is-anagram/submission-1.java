class Solution {
    public boolean isAnagram(String s, String t) {
        char[]mys=s.toCharArray();
        char[]myt=t.toCharArray();
        Arrays.sort(mys);
        Arrays.sort(myt);
        if(mys.length!=myt.length)
        return false;
        for(int i=0;i<mys.length;i++){
           if(mys[i]!=myt[i]){
                      return false;   
                }     
        }   
        return true;
  } 
}
