class Solution {
    public int majorityElement(int[] nums) {
        int temp = nums.length/2;
        int count_main=0,count=0,count_temp=0;
        Arrays.sort(nums);
        if(temp==0){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                count_temp = count;
            }
            else{
                count = 0;
            }
            if(count_temp>=temp){
                if(count==0){
                    return nums[i-1];
                }
                else{
                    return nums[i];
                }
            }
        }
        return 0;
    }
}