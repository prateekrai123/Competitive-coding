class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int target[] = new int[index.length];
        for(int i=0;i<nums.length;i++){
            a.add(index[i],nums[i]);
        }
        int j = 0;
        for(int i : a)
        {
            target[j] = i;
            j++;
        }
        return target;
    }
}