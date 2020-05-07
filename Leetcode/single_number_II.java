class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        java.util.Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=3){
            if(i==nums.length-1){
                a = nums[i];
                break;
            }
            if(nums[i]!=nums[i+1]){
                a = nums[i];
                break;
            }
        }
        return a;
    }
}