class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer>hs=new HashSet<>();
        int max=1;
        for(int i:nums){
            hs.add(i);
        }
        for(int num:hs){
            if(hs.contains(num-1)){
                continue;
            }
            int curr=1;
            int current=num;
            while(hs.contains(current+1)){
                current++;
                curr++;
            }
            max=Math.max(max,curr);
        }
        return max;
    }
}
