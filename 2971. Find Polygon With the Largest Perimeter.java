class Solution {
    public long largestPerimeter(int[] nums) {
        long sum=0,max=0;
        int pos=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(max==nums[i]){
                pos=i;
            }
        }
        // int zc=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         zc++;
        //     }
        // }
        if(sum==0){
            return -1;
        }
        if(sum-max>max){
            return sum;
        }
        else{
            nums[pos]=0;
            return largestPerimeter(nums);
        }
    }
}
