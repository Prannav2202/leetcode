class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int maxproduct=nums[0];
        int minproduct=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int tempmax=maxproduct;
            int tempmin=minproduct;
            maxproduct=Math.max(nums[i],Math.max(tempmax*nums[i],tempmin*nums[i]));
            minproduct=Math.min(nums[i],Math.min(tempmax*nums[i],tempmin*nums[i]));
            result=Math.max(result,maxproduct);
        }
        return result;
    }
}
