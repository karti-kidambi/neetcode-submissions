class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int count=0;
        HashSet<Character>hs=new HashSet<>();
        while(right<s.length()){
            if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                count=Math.max(count,right-left+1);
                right++;
            }
            else{
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return count;
    }
}
