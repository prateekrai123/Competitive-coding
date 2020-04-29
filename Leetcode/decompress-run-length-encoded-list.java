class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i+=2){
            sum += nums[i];
        }
        int a[] = new int[sum];
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2!=0)
                continue;
            else{
                while(nums[i]-->0){
                    a[k] = nums[i+1];
                    k++;
                }
            }
        }
        return a;
    }
}