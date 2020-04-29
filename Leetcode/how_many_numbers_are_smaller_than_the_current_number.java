class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int a[] = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int k=0;k<nums.length;k++){
                if(i==k)
                    continue;
                else if(nums[i]>nums[k])
                {
                    count++;
                }
            }
            a[j] = count;
            j++;
        }
        return a;
    }
}