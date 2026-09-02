class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre[]=new int[nums.length];
        int pos[]=new int[nums.length];
        pre[0]=1;
        pos[nums.length-1]=1;
        for(int i=1;i<pre.length;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        for(int i=pos.length-2;i>=0;i--){
            pos[i]=pos[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=pre[i]*pos[i];
        }
        return nums;
    }
}  
