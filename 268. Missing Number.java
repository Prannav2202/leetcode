class Solution {
    public int missingNumber(int[] nums) {
        int[] pk=new int[nums.length+1];
        Arrays.fill(pk,-1);
        for(int i=0;i<nums.length;i++){
            pk[nums[i]]=nums[i];
        }
        for(int i=0;i<pk.length;i++){
            if(pk[i]==-1){
                return i;
            }
        }
        return 0;
    }
}
