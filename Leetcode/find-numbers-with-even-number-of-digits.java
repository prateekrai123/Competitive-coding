class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            int temp = 0;
            while(i!=0){
                i /= 10;
                temp++;
            }
            if(temp%2==0)
                count++;
        }
        return count;
    }
}