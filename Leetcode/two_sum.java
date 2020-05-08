class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j)
                    continue;
                else
                {
                    if(nums[i]+nums[j]==target)
                    {
                        res[0] = i;
                        res[1] = j;
                        count++;
                        break;
                    }
                }
            }
            if(count>0)
                break;
        }
        return res;
    }
}